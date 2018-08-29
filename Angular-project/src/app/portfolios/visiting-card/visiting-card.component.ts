import { Component, OnInit } from '@angular/core';
import { UserLocation } from '../../userLocation';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-visiting-card',
  templateUrl: './visiting-card.component.html',
  styleUrls: ['./visiting-card.component.css']
})
export class VisitingCardComponent implements OnInit {

  UserData: any = [];
  loc = new UserLocation();
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  getVisitingCard() {
    this.get().subscribe( data => {
       this.UserData = data;

    });
 }

 get(): Observable<any> {
   return this.http.get(`http://13.232.19.29:8092/downstream/api/v1/user/${JSON.parse(localStorage.getItem('currentUser'))}`);
 }

}
