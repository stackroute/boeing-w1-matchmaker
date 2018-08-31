import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  SearchResult: any = [];
  name: any = [];
  skills: any = [];
  city: any = [];
  experience: any = [];

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  getResults(searchQuery: string) {
    this.search(searchQuery).subscribe( data => {

       this.SearchResult = data;
       console.log(this.SearchResult);
       this.name[0] = this.SearchResult[0].profileId;
       this.skills = this.SearchResult.skills;
       this.city = this.SearchResult.city;
       this.experience = this.SearchResult.experience;
     });
  }

  search(searchQuery: string) {
    console.log(searchQuery);
    console.log("hello");
    return this.http.get('http://http://13.232.19.29:8092/search/api/v1/search/' + searchQuery);
  }

}
