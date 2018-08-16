import {NgModule} from '@angular/core';
import {Routes , RouterModule, Router} from '@angular/router';
import { ProfileComponent } from './profile/profile.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  {path: 'profile', component: ProfileComponent},
  {path: 'register', component: RegistrationComponent},
  {path: 'login', component: LoginComponent}
];

@NgModule({
    imports: [
      RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
  })

  export class AppRoutingModule {}
  export const routingComponents = [ProfileComponent, RegistrationComponent, LoginComponent];
