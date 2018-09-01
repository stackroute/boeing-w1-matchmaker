import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-portfolios',
  templateUrl: './portfolios.component.html',
  styleUrls: ['./portfolios.component.css']
})
export class PortfoliosComponent implements OnInit {
  id: String;
  UserData: any = [];
  image = new Image();
  constructor(private route: ActivatedRoute,
    private router: Router, private http: HttpClient) {

    }

  ngOnInit() {
    this.route
    .queryParams
    .subscribe(params => {
      this.id = params['id'] || JSON.parse(localStorage.getItem('currentUser'));
    });
    this.get(this.id).subscribe( data => {
      this.UserData = data;
      this.image.src = 'data:image/png;base64,' + this.UserData.personalInfo.picture;
      console.log('data:image/png;base64,' + this.UserData.personalInfo.picture);
    });
  }

  get(clickedId): Observable<any> {
    return this.http.get(`http://13.232.19.29:8092/downstream/api/v1/user/${clickedId}`);
  }

}
