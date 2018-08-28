import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';
import { UserAcademy } from '../../userAcademy';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-academic-qualifications',
  templateUrl: './academic-qualifications.component.html',
  styleUrls: ['./academic-qualifications.component.css'],
  providers: [UserService]
})
export class AcademicQualificationsComponent implements OnInit {
  private newPost_Academy;
  private editPost_Academy;
  private firstTime_check = false;
  // private editPost_Academy;
  UserData: any = [];

  constructor(private userService: UserService, private http: HttpClient) {

  }

  ngOnInit() {
    this.newPost_Academy = new UserAcademy();
    this.editPost_Academy = new UserAcademy();
    this.getAcademics();
  }

  addPost_Academy() {
    this.newPost_Academy.profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.newPost_Academy.message = 'save';
    this.userService.addPost_Academy(this.newPost_Academy).subscribe(() => {
    });
    setTimeout(() => {
      this.getAcademics();
      }, 1000);
    // this.firstTime_check = true;
    // this.getPost_Academy = this.newPost_Academy;
    }

    update(j) {
      this.editPost_Academy[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
      this.editPost_Academy[j].message = 'update' + j;
      this.userService.addPost_Academy(this.editPost_Academy[j]).subscribe(() => {  });
    }

    delete(j) {
      this.editPost_Academy[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
      this.editPost_Academy[j].message = 'delete' + j;
      this.userService.addPost_Academy(this.editPost_Academy[j]).subscribe(() => {  });
      setTimeout(() => {
        this.getAcademics();
        }, 1000);
    }

    getAcademics() {
       this.get().subscribe( data => {
          this.UserData = data;
          this.editPost_Academy = data.academics;
          if (this.UserData.academics == null) {
            this.firstTime_check = false;
          } else {
            this.firstTime_check = true;
          }
        });
    }

    get(): Observable<any> {
      return this.http.get(`http://172.23.238.198:8090/api/v1/user/${JSON.parse(localStorage.getItem('currentUser'))}`);
    }

}
