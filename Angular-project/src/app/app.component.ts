import { Component, OnInit } from '@angular/core';
import { UserService } from './user.service';
import { AuthenticationService } from './services/authentication.service';
import { Router } from '@angular/router';
// import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [UserService]
})
export class AppComponent implements OnInit {
  private user_check = false;
  profile: String;
  constructor(private authenticationService: AuthenticationService, private router: Router) {
    authenticationService.getLoggedInName.subscribe(() => {
      console.log('hi');
      this.ngOnInit();
    });
  }
  ngOnInit() {
  if (localStorage.getItem('currentUser') != null) {
    this.user_check = true;
    this.profile = JSON.parse(localStorage.getItem('currentUser'));
  }
  }

  logout() {
    this.authenticationService.logout();
    this.router.navigate(['/login']);
    this.user_check = false;
  }


}
