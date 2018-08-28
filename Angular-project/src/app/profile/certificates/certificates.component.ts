import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';
import { UserCertificates } from '../../userCertificates';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-certificates',
  templateUrl: './certificates.component.html',
  styleUrls: ['./certificates.component.css'],
  providers: [UserService]
})
export class CertificatesComponent implements OnInit {
  private newPost_Certificates;
  private editPost_Certificates;
  private firstTime_check = false;
  UserData: any = [];

  constructor(private userService: UserService, private http: HttpClient) {
    
  }

  ngOnInit() {
    this.newPost_Certificates = new UserCertificates();
    this.editPost_Certificates = new UserCertificates();
    this.getCertificates();
  }

  addPost_Certificates() {
    this.newPost_Certificates.profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.newPost_Certificates.message = 'save';   
    this.userService.addPost_Certificates(this.newPost_Certificates).subscribe(() => {
    });
    setTimeout(() => {
      this.getCertificates();
      }, 1000);
  }

  update(j) {
    this.editPost_Certificates[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.editPost_Certificates[j].message = 'update' + j;
    this.userService.addPost_Certificates(this.editPost_Certificates[j]).subscribe(() => {  });
  }

  delete(j) {
    this.editPost_Certificates[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.editPost_Certificates[j].message = 'delete' + j;
    this.userService.addPost_Certificates(this.editPost_Certificates[j]).subscribe(() => {  });
    setTimeout(() => {
      this.getCertificates();
      }, 1000);
  }

  getCertificates() {
     this.get().subscribe( data => {
        this.UserData = data;
        this.editPost_Certificates = data.certificates;
        if (this.UserData.certificates == null) {
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
