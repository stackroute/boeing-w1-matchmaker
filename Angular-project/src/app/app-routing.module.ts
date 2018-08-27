import {NgModule} from '@angular/core';
import {Routes , RouterModule, Router} from '@angular/router';
import { ProfileComponent } from './profile/profile.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './guards/auth.guard';
import { PortfoliosComponent } from './portfolios/portfolios.component';
import { VisitingCardComponent } from './portfolios/visiting-card/visiting-card.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path: '', component: HomeComponent, canActivate: [AuthGuard]},
  {path: 'profile', component: ProfileComponent, canActivate: [AuthGuard]},
  {path: 'portfolios', component: PortfoliosComponent, canActivate: [AuthGuard]},
  {path: 'register', component: RegistrationComponent},
  {path: 'login', component: LoginComponent},
  {path: 'portfolios/visiting', component: VisitingCardComponent, canActivate: [AuthGuard]}

];

@NgModule({
    imports: [
      RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
  })

  export class AppRoutingModule {}
  export const routingComponents = [ProfileComponent, PortfoliosComponent, VisitingCardComponent, RegistrationComponent, LoginComponent];
