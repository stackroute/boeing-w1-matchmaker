import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';
import { UserPI } from '../../userPI';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
// import { Router } from '@angular/router';

@Component({
  selector: 'app-personal-info',
  templateUrl: './personal-info.component.html',
  styleUrls: ['./personal-info.component.css'],
  providers: [UserService]
})
export class PersonalInfoComponent implements OnInit {

  private imageUrl: String = 'assets/img/default-profile-picture.jpg';
  private fileToUpload: File = null;
  private newPost_PI;
  private getPost_PI;
  private editPost_PI;
  private firstTime_check = false;
  UserData: any = [];

  constructor(private userService: UserService, private http: HttpClient) {
  }

  ngOnInit() {
    this.newPost_PI = new UserPI();
    this.getPost_PI = new UserPI();
    this.getPI();
  }

  addPost_PI() {
    this.newPost_PI.profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.newPost_PI.message = 'save';
    this.userService.addPost_PI(this.newPost_PI).subscribe(() => {
    });
    setTimeout(() => {
      this.getPI();
      }, 1000);
    }

    update() {
      this.editPost_PI.profileId = JSON.parse(localStorage.getItem('currentUser'));
      this.editPost_PI.message = 'update';
      this.userService.addPost_PI(this.editPost_PI).subscribe(() => {  });
    }

    getPI() {
       this.get().subscribe( data => {
          this.UserData = data;
          this.editPost_PI = data.personalInfo;
          if (this.UserData.personalInfo == null) {
            this.firstTime_check = false;
          } else {
            this.firstTime_check = true;
          }
        });
    }

    get(): Observable<any> {
      return this.http.get(`http://13.232.19.29:8092/downstream/api/v1/user/${JSON.parse(localStorage.getItem('currentUser'))}`);
    }

    handleFileInput(file: FileList) {
      this.fileToUpload = file.item(0);

      const reader = new FileReader();
      reader.onload = (event: any) => {
        this.imageUrl = event.target.result;
        this.newPost_PI.picture = reader.result;
        this.editPost_PI.picture = reader.result;
      };
      reader.readAsDataURL(this.fileToUpload);

    }

}
