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
  private getPost_Skill;
  private Skills_check;

  constructor(private userService: UserService) {
    this.Skills_check = false;
   }

  ngOnInit() {
    this.newPost_Skill = new UserSkill();
    this.getPost_Skill = new UserSkill();
  }

  addPost_Skill() {
    this.userService.addPost_Skill(this.newPost_Skill).subscribe(() => {
    });
    this.Skills_check = true;
    this.getPost_Skill = this.newPost_Skill;
    }

}
