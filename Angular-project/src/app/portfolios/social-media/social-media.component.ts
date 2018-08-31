import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-social-media',
  templateUrl: './social-media.component.html',
  styleUrls: ['./social-media.component.css']
})
export class SocialMediaComponent implements OnInit {
  UserData: any = [];
  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.getSocialMedia();
  }

  getSocialMedia() {
    this.get().subscribe( data => {
       this.UserData = data;
    });
  }

  get(): Observable<any> {
    return this.http.get(`http://13.232.19.29:8092/downstream/api/v1/user/${JSON.parse(localStorage.getItem('currentUser'))}`);
  }

}
