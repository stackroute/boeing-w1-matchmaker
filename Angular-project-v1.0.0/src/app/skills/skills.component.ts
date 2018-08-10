import { Component, OnInit } from '@angular/core';
import { UserService } from '.././user.service';
import { UserSkill } from '.././userSkill';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css'],
  providers: [UserService]
})
export class SkillsComponent implements OnInit {
  private newPost_Skill ;

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.newPost_Skill = new UserSkill();
  }

  addPost_Skill() {
    this.userService.addPost_Skill(this.newPost_Skill).subscribe(() => {
      console.log("posted");
    });
    }

}
