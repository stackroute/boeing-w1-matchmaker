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
  private getPost_Exp;
  private exp_check;

  constructor(private userService: UserService) {
    this.exp_check = false;
   }

  ngOnInit() {
    this.newPost_Exp = new UserExp();
    this.getPost_Exp = new UserExp();
  }

  addPost_Exp() {
    this.userService.addPost_Exp(this.newPost_Exp).subscribe(() => {
    });
    this.exp_check = true;
    this.getPost_Exp = this.newPost_Exp;
    }

}
