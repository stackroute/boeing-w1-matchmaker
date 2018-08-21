import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router, ActivatedRoute} from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  userForm: FormGroup;
  redirectUrl: string;
  error = '';
  constructor(private formBuilder: FormBuilder,
    private activatedRoute: ActivatedRoute,
    private router: Router, private authenticationService: AuthenticationService) {
      // this.redirectUrl = this.activatedRoute.snapshot.queryParams['redirectTo'];
    }

    ngOnInit() {
      this.userForm = this.formBuilder.group({
        username: [
          '',
          [Validators.required]
        ],
        password: ['', [Validators.required]]
      });
      this.authenticationService.logout();
    }

    loginSubmit() {

      this.authenticationService.login(this.username.value, this.password.value)
      .subscribe(
          data => {
              this.router.navigate(['/']);
          },
          error => {
              this.error = 'Username or password is incorrect';
          });
    }


    get username() {
      return this.userForm.get('username');
    }

    get password() {
      return this.userForm.get('password');
    }

}
