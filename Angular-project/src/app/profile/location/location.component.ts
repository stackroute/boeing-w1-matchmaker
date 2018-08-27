import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';
import { UserLocation } from '../../userLocation';
import { FormGroup } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css'],
  providers: [UserService]
})
export class LocationComponent implements OnInit {
  private newPost_Loc ;
  private editPost_Loc;
  private firstTime_check = false;
  UserData: any = [];
  url: string = 'http://172.23.238.203:8090/api/v1/user/' + JSON.parse(localStorage.getItem('currentUser'));
  locForm: FormGroup;
  constructor(private userService: UserService, private http: HttpClient) {

  }

  ngOnInit() {
    this.newPost_Loc = new UserLocation();
    this.editPost_Loc = new UserLocation();
    this.newPost_Loc.addressType = 'previous';
    this.getLocations();
  }

  addPost_Location() {
    this.newPost_Loc.profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.newPost_Loc.message = 'save';
    this.userService.addPost_Location(this.newPost_Loc).subscribe(() => {  });
    }

  update(j) {
    this.editPost_Loc[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.editPost_Loc[j].message = 'update' + j;
    this.userService.addPost_Location(this.editPost_Loc[j]).subscribe(() => {  });
  }

  delete(j) {
    this.editPost_Loc[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.editPost_Loc[j].message = 'delete' + j;
    this.userService.addPost_Location(this.editPost_Loc[j]).subscribe(() => {  });
  }

  getLocations() {
     this.get().subscribe( data => {
        this.UserData = data;
        this.editPost_Loc = data.location;
        console.log('hey');
        if (this.UserData.location == null) {
          this.firstTime_check = false;
        } else {
          this.firstTime_check = true;
        }
      });
  }

  get(): Observable<any> {
    return this.http.get(`http://172.23.238.203:8090/api/v1/user/${JSON.parse(localStorage.getItem('currentUser'))}`);
  }

}
