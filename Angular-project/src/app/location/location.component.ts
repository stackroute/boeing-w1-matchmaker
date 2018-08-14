import { Component, OnInit } from '@angular/core';
import { UserService } from '.././user.service';
import { UserLocation } from '.././userLocation';

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

  constructor(private userService: UserService) { 
    this.loc_check = false;
  }

  ngOnInit() {
    this.newPost_Loc = new UserLocation();
    this.getPost_Loc = new UserLocation();
  }

  addPost_Location() {
    this.userService.addPost_Location(this.newPost_Loc).subscribe(() => {
    });
    this.loc_check = true;
    this.getPost_Loc = this.newPost_Loc;
    }

}
