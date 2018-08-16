import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule , routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserService } from './user.service';
import { PersonalInfoComponent } from './profile/personal-info/personal-info.component';
import { SkillsComponent } from './profile/skills/skills.component';
import { ExperienceComponent } from './profile/experience/experience.component';
import { LocationComponent } from './profile/location/location.component';
import { ProjectsComponent } from './profile/projects/projects.component';
import { CertificatesComponent } from './profile/certificates/certificates.component';
import { AcademicQualificationsComponent } from './profile/academic-qualifications/academic-qualifications.component';
import { ProfileComponent } from './profile/profile.component';
import { RegistrationComponent } from './registration/registration.component';
import { ExistingEmailValidatorDirective } from './registration/customValidaters/existingEmail';
import { ExistingUsernameValidatorDirective } from './registration/customValidaters/existingUserName';
import { LoginComponent } from './login/login.component';
@NgModule({
  declarations: [
    AppComponent,
    PersonalInfoComponent,
    SkillsComponent,
    ExperienceComponent,
    LocationComponent,
    ProjectsComponent,
    CertificatesComponent,
    AcademicQualificationsComponent,
    routingComponents,
    ProfileComponent,
    RegistrationComponent,
    ExistingEmailValidatorDirective,
    ExistingUsernameValidatorDirective,
    LoginComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, FormsModule, AppRoutingModule,HttpModule,ReactiveFormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
