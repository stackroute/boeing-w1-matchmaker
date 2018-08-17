import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  userForm: FormGroup;
  constructor(private formBuilder: FormBuilder,
    private router: Router) { }

    ngOnInit() {
      this.userForm = this.formBuilder.group({
        username: [
          '',
          [Validators.required]
        ],
        password: ['', [Validators.required]]
      });
    }

    loginSubmit() {
      const newUser = this.userForm.value;
      this.router.navigate(['/profile']);
    }

    get username() {
      return this.userForm.get('username');
    }

    get password() {
      return this.userForm.get('password');
    }

}
