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

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.newPost_Loc = new UserLocation();
  }

  addPost_Location() {
    this.userService.addPost_Location(this.newPost_Loc).subscribe(() => {
      console.log("posted");
    });
    }

}
