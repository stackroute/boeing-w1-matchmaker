import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
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
// import { JwtModule } from '@auth0/angular-jwt';
import { AuthGuard } from './guards/auth.guard';
import {AuthenticationService} from './services/authentication.service';
import { ErrorInterceptor } from './interceptors/error.interceptor';
import { JwtInterceptor } from './interceptors/jwt.interceptor';
import { MaterialModule } from './material';
import { PortfoliosComponent } from './portfolios/portfolios.component';
import { VisitingCardComponent } from './portfolios/visiting-card/visiting-card.component';
import {MatButtonModule, MatCheckboxModule} from '@angular/material';
import {MatDividerModule} from '@angular/material/divider';
import {MatListModule} from '@angular/material/list';
// export function tokenGetter() {
//   return localStorage.getItem('access_token');
// }

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
    LoginComponent,
    PortfoliosComponent,
    VisitingCardComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, FormsModule,MatDividerModule,MatListModule,
    AppRoutingModule, HttpModule, ReactiveFormsModule, MaterialModule,MatButtonModule, MatCheckboxModule
    // JwtModule.forRoot({
    //   config: {
    //     tokenGetter: tokenGetter,
    //     whitelistedDomains: ['localhost:8082', 'localhost:8081'],
    //     blacklistedRoutes: ['']
    //   }
    // })
  ],
  providers: [
    UserService,
    AuthenticationService,
    UserService,
    AuthGuard,
    { provide: HTTP_INTERCEPTORS, useClass: JwtInterceptor, multi: true },
    { provide: HTTP_INTERCEPTORS, useClass: ErrorInterceptor, multi: true }],
  bootstrap: [AppComponent]
})
export class AppModule { }
