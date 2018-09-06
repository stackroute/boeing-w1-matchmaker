import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';
import { UserLocation } from '../../userLocation';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FormControl } from '@angular/forms';
import { AutocompleteService } from '../../autocomplete.service';


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
  searchTerm: FormControl = new FormControl();
  city = <any>[];
  constructor(private userService: UserService, private http: HttpClient,
     private autocomplete: AutocompleteService) {

  }

  ngOnInit() {
    this.searchTerm.valueChanges.subscribe(term => {
      if (term !== '') {
        this.autocomplete.searchCity(term).subscribe(data => {
          this.city = data as any[];
        });
      }
    });
    this.newPost_Loc = new UserLocation();
    this.editPost_Loc = new UserLocation();
    this.newPost_Loc.addressType = 'present';
    this.getLocations();
  }

  addPost_Location() {
    this.newPost_Loc.profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.newPost_Loc.message = 'save';
    this.userService.addPost_Location(this.newPost_Loc).subscribe(() => {  });
    setTimeout(() => {
      this.getLocations();
      }, 1000);
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
    setTimeout(() => {
      this.getLocations();
      }, 1000);
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
    return this.http.get(`http://13.232.19.29:8092/downstream/api/v1/user/${JSON.parse(localStorage.getItem('currentUser'))}`);
  }

}
