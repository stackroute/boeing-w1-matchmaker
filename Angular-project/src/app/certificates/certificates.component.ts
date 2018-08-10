import { Component, OnInit } from '@angular/core';
import { UserService } from '.././user.service';
import { UserCertificates } from '.././userCertificates';

@Component({
  selector: 'app-certificates',
  templateUrl: './certificates.component.html',
  styleUrls: ['./certificates.component.css'],
  providers: [UserService]
})
export class CertificatesComponent implements OnInit {
  private newPost_Certificates;
  private getPost_Certificates;
  private train_check;

  constructor(private userService: UserService) { 
    this.train_check = false;
  }

  ngOnInit() {
    this.newPost_Certificates = new UserCertificates();
    this.getPost_Certificates = new UserCertificates();
  }

  addPost_Certificates() {
    this.userService.addPost_Certificates(this.newPost_Certificates).subscribe(() => {
    });
    this.train_check = true;
    this.getPost_Certificates = this.newPost_Certificates;
    }

}
