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

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.newPost_Certificates = new UserCertificates();
  }

  addPost_Certificates() {
    this.userService.addPost_Certificates(this.newPost_Certificates).subscribe(() => {
      console.log("posted");
    });
    }

}
