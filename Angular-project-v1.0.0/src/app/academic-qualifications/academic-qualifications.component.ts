import { Component, OnInit } from '@angular/core';
import { UserService } from '.././user.service';
import { UserAcademy } from '.././userAcademy';

@Component({
  selector: 'app-academic-qualifications',
  templateUrl: './academic-qualifications.component.html',
  styleUrls: ['./academic-qualifications.component.css'],
  providers: [UserService]
})
export class AcademicQualificationsComponent implements OnInit {
  private newPost_Academy;

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.newPost_Academy = new UserAcademy();
  }

  addPost_Academy() {
    this.userService.addPost_Academy(this.newPost_Academy).subscribe(() => {
      console.log("posted");
    });
    }

}
