import { Component, OnInit } from '@angular/core';
import { UserSkill } from '../../userSkill';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-skill-portfolio',
  templateUrl: './skill-portfolio.component.html',
  styleUrls: ['./skill-portfolio.component.css']
})
export class SkillPortfolioComponent implements OnInit {

   UserData: any = [];
  skill = new UserSkill();
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  // getVisitingCard() {
  //   this.get().subscribe( data => {
  //      this.UserData = data;

  //   });
  // }

  // get(): Observable<any> {
  //   return this.http.get(`http://13.232.19.29:8092/downstream/api/v1/user/${JSON.parse(localStorage.getItem('currentUser'))}`);
  // }

}
