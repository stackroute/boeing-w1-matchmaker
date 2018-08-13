import { Component, OnInit } from '@angular/core';
import { UserService } from '.././user.service';
import { UserProject } from '.././userProject';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css'],
  providers: [UserService]
})
export class ProjectsComponent implements OnInit {
  private newPost_Project;
  private getPost_Project;
  private proj_check;

  constructor(private userService: UserService) {
    this.proj_check = false;
   }

  ngOnInit() {
    this.newPost_Project = new UserProject();
    this.getPost_Project = new UserProject();
  }

  addPost_Project() {
    this.userService.addPost_Project(this.newPost_Project).subscribe(() => {
    });
    this.proj_check = true;
    this.getPost_Project = this.newPost_Project;
    }

}
