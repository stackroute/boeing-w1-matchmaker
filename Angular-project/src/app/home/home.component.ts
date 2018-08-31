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

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }

  getResults(searchQuery: string) {
    this.search(searchQuery).subscribe( data => {
       this.SearchResult = data;
     });
  }

  search(searchQuery: string) {
    return this.http.get('http://13.232.19.29:8092/nlp/api/v1/search/' + searchQuery);
  }

}
