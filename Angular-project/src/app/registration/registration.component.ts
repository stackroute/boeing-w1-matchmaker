import { Component, OnInit } from '@angular/core';
import { RegisterService } from '../register.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { existingEmail } from './customValidaters/existingEmail';
import { existingUserName } from './customValidaters/existingUserName';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css'],
  providers: [RegisterService]
})
export class RegistrationComponent implements OnInit {
  userForm: FormGroup;
  constructor(
    private formBuilder: FormBuilder,
    private registerService: RegisterService
  ) {}

  ngOnInit() {
    this.userForm = this.formBuilder.group({
      username: [
        '',
        [Validators.required],
        [existingUserName(this.registerService)]
      ],
      email: [
        '',
        [Validators.required, Validators.email],
        [existingEmail(this.registerService)]
      ],
      password: ['', [Validators.required]]
    });
  }

  profileSubmit() {
    const newUser = this.userForm.value;
    this.registerService.addNewUser(newUser).subscribe(() => {});
  }

  get username() {
    return this.userForm.get('username');
  }
  get email() {
    return this.userForm.get('email');
  }
}
