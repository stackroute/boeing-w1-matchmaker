import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  name: string;
  constructor() { }

  ngOnInit() {
    this.name = JSON.parse(localStorage.getItem('currentUser'));
  }

}
