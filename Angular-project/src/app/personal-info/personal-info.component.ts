import { Component, OnInit } from '@angular/core';
import { UserService } from '.././user.service';
import { UserPI } from '.././userPI';
// import { Router } from '@angular/router';

@Component({
  selector: 'app-personal-info',
  templateUrl: './personal-info.component.html',
  styleUrls: ['./personal-info.component.css'],
  providers: [UserService]
})
export class PersonalInfoComponent implements OnInit {
  private newPost_PI;
  private getPost_PI;
  private pi_check;
  
  constructor(private userService: UserService) { 
    this.pi_check = false;
  }

  ngOnInit() {
    this.newPost_PI = new UserPI();
    this.getPost_PI = new UserPI();
  }

  addPost_PI() {
    this.userService.addPost_PI(this.newPost_PI).subscribe(() => {
    });
    this.pi_check = true;
    this.getPost_PI = this.newPost_PI;
    }
    
}
