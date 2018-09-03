import { Component, OnInit } from '@angular/core';
import { UserService } from '../../user.service';
import { UserProject } from '../../userProject';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FormControl } from '@angular/forms';
import { AutocompleteService } from '../../autocomplete.service';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css'],
  providers: [UserService]
})
export class ProjectsComponent implements OnInit {
  private newPost_Project;
  private editPost_Project;
  private firstTime_check;
  UserData: any = [];
  searchTerm1: FormControl = new FormControl();
  searchTerm2: FormControl = new FormControl();
  skill = <any>[];
  location = <any>[];
  constructor(private userService: UserService, private http: HttpClient, private autocomplete: AutocompleteService) {

   }

  ngOnInit() {
    this.searchTerm1.valueChanges.subscribe(term => {
      if (term !== '') {
        this.autocomplete.searchSkill(term).subscribe(data => {
          this.skill = data as any[];
        });
      }
    });
    this.newPost_Project = new UserProject();
    this.editPost_Project = new UserProject();
    this.getProjects();
  }

  addPost_Project() {
    this.newPost_Project.profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.newPost_Project.message = 'save';
    this.userService.addPost_Project(this.newPost_Project).subscribe(() => {
    });
    setTimeout(() => {
      this.getProjects();
      }, 1000);
  }

  update(j) {
    this.editPost_Project[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.editPost_Project[j].message = 'update' + j;
    this.userService.addPost_Project(this.editPost_Project[j]).subscribe(() => {  });
  }

  delete(j) {
    this.editPost_Project[j].profileId = JSON.parse(localStorage.getItem('currentUser'));
    this.editPost_Project[j].message = 'delete' + j;
    this.userService.addPost_Project(this.editPost_Project[j]).subscribe(() => {  });
    setTimeout(() => {
      this.getProjects();
      }, 1000);
  }

  getProjects() {
     this.get().subscribe( data => {
        this.UserData = data;
        this.editPost_Project = data.project;
        if (this.UserData.project == null) {
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
