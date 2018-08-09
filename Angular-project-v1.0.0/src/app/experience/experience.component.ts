import { Component, OnInit } from '@angular/core';
import { UserService } from '.././user.service';
import { UserExp } from '.././userExp';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css'],
  providers: [UserService]
})
export class ExperienceComponent implements OnInit {
  private newPost_Exp ;

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.newPost_Exp = new UserExp();
  }

  addPost_Exp() {
    this.userService.addPost_Exp(this.newPost_Exp).subscribe(() => {
      console.log("posted");
    });
    }

}
