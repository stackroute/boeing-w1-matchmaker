import { Component } from '@angular/core';
import { UserService } from './user.service';
// import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [UserService]
})
export class AppComponent {

  constructor() { 

  }

  ngOnInit() {
    // this.route
    // .queryParams
    // .subscribe(params => {
    //   this.id = +params['id'] || 0;
    // });
    // switch(this.id){
    //   case 1: this.PI_check = true;
    // }
  }



}
