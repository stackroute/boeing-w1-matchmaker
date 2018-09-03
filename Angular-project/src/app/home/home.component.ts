import { Component, OnInit } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Router } from "@angular/router";
import { Constructor } from "@angular/cdk/table";

@Component({
  selector: "app-home",
  templateUrl: "./home.component.html",
  styleUrls: ["./home.component.css"]
})
export class HomeComponent implements OnInit {
  private searchQuery1;
  SearchResult: any = [];
//   WOW: any;
//   wow = new WOW({
//     boxClass: 'wow', // default
//     animateClass: 'animated', // default
//     offset: 0, // default
//     mobile: true, // default
//     live: true // default
// });



  constructor(private http: HttpClient, private router: Router) {}

  ngOnInit() {
    this.getRandomResults();
    // this.wow.init();
  }

  getRandomResults() {
    switch (Math.floor(Math.random() * 10)) {
      case 0:
        this.searchQuery1 = "java";
        break;

      case 1:
        this.searchQuery1 = "angular";
        break;
      case 2:
        this.searchQuery1 = "javaScript";
        break;
      case 3:
        this.searchQuery1 = "html";
        break;
      case 4:
        this.searchQuery1 = "css";
        break;
      case 5:
        this.searchQuery1 = "mongodb";
        break;
      case 6:
        this.searchQuery1 = "bangalore";
        break;
      case 7:
        this.searchQuery1 = "delhi";
        break;

      case 8:
        this.searchQuery1 = "boeing";
        break;

      case 9:
        this.searchQuery1 = "apple";
        break;

      default:
        this.searchQuery1 = "neo4j";
    }
    this.search(this.searchQuery1).subscribe(data => {
      this.SearchResult = data;
    });
  }

  getResults(searchQuery: string) {
    this.search(searchQuery).subscribe(data => {
      this.SearchResult = data;
    });
  }

  search(searchQuery: string) {
    return this.http.get(
      "http://13.232.19.29:8092/nlp/api/v1/search/" + searchQuery
    );
  }

  portfolioRedirect(pid: String) {
    this.router.navigate(["/portfolios"], { queryParams: { id: pid } });
  }
}
