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
  constructor(private userService: UserService) { }

  ngOnInit() {
    this.newPost_Project = new UserProject();
  }

  addPost_Project() {
    this.userService.addPost_Project(this.newPost_Project).subscribe(() => {
      console.log("posted");
    });
    }

}
