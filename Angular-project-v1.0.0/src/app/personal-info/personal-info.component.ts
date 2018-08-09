import { Component, OnInit } from '@angular/core';
import { UserService } from '.././user.service';
import { UserPI } from '.././userPI';

@Component({
  selector: 'app-personal-info',
  templateUrl: './personal-info.component.html',
  styleUrls: ['./personal-info.component.css'],
  providers: [UserService]
})
export class PersonalInfoComponent implements OnInit {
  private newPost_PI ;
  constructor(private userService: UserService) { }

  ngOnInit() {
    this.newPost_PI = new UserPI();
  }

  addPost_PI() {
    this.userService.addPost_PI(this.newPost_PI).subscribe(() => {
      console.log("posted");
    });
    }

}
