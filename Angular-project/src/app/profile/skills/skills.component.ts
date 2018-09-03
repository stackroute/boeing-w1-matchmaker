import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';
import { UserSkill } from '../../userSkill';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FormControl } from '@angular/forms';
import { AutocompleteService } from '../../autocomplete.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css'],
  providers: [UserService]
})
export class SkillsComponent implements OnInit {
  private newPost_Skill ;
  private editPost_Skill;
  searchTerm: FormControl = new FormControl();
  skill = <any>[];
  private firstTime_check = false;
  UserData: any = [];

  constructor(private userService: UserService, private http: HttpClient, private autocomplete: AutocompleteService) {
   }

  ngOnInit() {
    this.searchTerm.valueChanges.subscribe(term => {
    if (term !== '') {
      this.autocomplete.searchSkill(term).subscribe(data => {
        this.skill = data as any[];
      });
    }
  });
    this.newPost_Skill = new UserSkill();
    this.editPost_Skill = new UserSkill();
    this.getSkills();
  }

  addPost_Skill() {
    this.newPost_Skill.profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.newPost_Skill.message = 'save';
    this.userService.addPost_Skill(this.newPost_Skill).subscribe(() => {
    });
        setTimeout(() => {
        this.getSkills();
        }, 1000);
  }

  update(j) {
    this.editPost_Skill[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.editPost_Skill[j].message = 'update' + j;
    this.userService.addPost_Skill(this.editPost_Skill[j]).subscribe(() => {  });
  }

  delete(j) {
    this.editPost_Skill[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.editPost_Skill[j].message = 'delete' + j;
    this.userService.addPost_Skill(this.editPost_Skill[j]).subscribe(() => {  });
    setTimeout(() => {
      this.getSkills();
      }, 1000);
  }

  getSkills() {
     this.get().subscribe( data => {
        this.UserData = data;
        this.editPost_Skill = data.skills;
        if (this.UserData.skills == null) {
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
