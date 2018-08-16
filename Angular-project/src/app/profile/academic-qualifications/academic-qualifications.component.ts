import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';
import { UserAcademy } from '../../userAcademy';

@Component({
  selector: 'app-academic-qualifications',
  templateUrl: './academic-qualifications.component.html',
  styleUrls: ['./academic-qualifications.component.css'],
  providers: [UserService]
})
export class AcademicQualificationsComponent implements OnInit {
  private newPost_Academy;
  private getPost_Academy;
  private acad_check;


  constructor(private userService: UserService) {
    this.acad_check = false;
  }

  ngOnInit() {
    this.newPost_Academy = new UserAcademy();
    this.getPost_Academy = new UserAcademy();

  }

  addPost_Academy() {
    this.userService.addPost_Academy(this.newPost_Academy).subscribe(() => {
    });
    this.acad_check = true;
    this.getPost_Academy = this.newPost_Academy;
    }

}
