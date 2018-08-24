import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';
import { UserLocation } from '../../userLocation';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css'],
  providers: [UserService]
})
export class LocationComponent implements OnInit {
  private newPost_Loc ;
  private getPost_Loc;
  private loc_check;
  locForm: FormGroup;
  constructor(private userService: UserService, private formBuilder: FormBuilder) {
    this.loc_check = false;
  }

  ngOnInit() {
    this.newPost_Loc = new UserLocation();
    this.getPost_Loc = new UserLocation();
    this.newPost_Loc.addressType = 'previous';
    this.newPost_Loc.profileId = 'rgrVik123';
    this.locForm = this.formBuilder.group({
      city: ['', [Validators.required]]
    });
  }

  addPost_Location() {
    this.newPost_Loc.profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.userService.addPost_Location(this.newPost_Loc).subscribe(() => {
    });
    this.loc_check = true;
    this.getPost_Loc = this.newPost_Loc;
    }

    get city() {
      return this.locForm.get('city');
    }
}
