import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  name: string;
  UserData: any = [];
  private imgCheck = false;
  image = new Image();

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.name = JSON.parse(localStorage.getItem('currentUser'));
    this.get().subscribe(data => {
      this.UserData = data;
      if (this.UserData.personalInfo.picture != null) {
        this.image.src =
        'data:image/png;base64,' + this.UserData.personalInfo.picture;
        this.imgCheck = true;
      }
    });
  }

  get(): Observable<any> {
    return this.http.get(
      `http://13.232.19.29:8092/downstream/api/v1/user/${this.name}`
    );
  }
}
