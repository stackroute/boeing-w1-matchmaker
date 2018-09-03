import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-start',
  templateUrl: './start.component.html',
  styleUrls: ['./start.component.css']
})
export class StartComponent implements OnInit {
//   WOW: any;
//   wow = new WOW({
//     boxClass: 'wow', // default
//     animateClass: 'animated', // default
//     offset: 0, // default
//     mobile: true, // default
//     live: true // default
// });
  constructor(private router:Router) { }

  ngOnInit() {
    // this.wow.init();
  }

  loginOrprofile() {
    if(localStorage.getItem('currentUser') != null){
     this.router.navigate(['profile']);
    } else {
    this.router.navigate(['login']);
    }
  }

}
