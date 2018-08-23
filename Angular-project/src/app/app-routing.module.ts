import {NgModule} from '@angular/core';
import {Routes , RouterModule, Router} from '@angular/router';
import { ProfileComponent } from './profile/profile.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './guards/auth.guard';
import { PortfoliosComponent } from './portfolios/portfolios.component';
import { VisitingCardComponent } from './portfolios/visiting-card/visiting-card.component';
import { SkillsPortfolioComponent } from './portfolios/skills-portfolio/skills-portfolio.component';
import { BusinessPortfolioComponent } from './portfolios/business-portfolio/business-portfolio.component';

const routes: Routes = [
  {path: 'profile', component: ProfileComponent},
  {path: 'portfolios', component: PortfoliosComponent},
  {path: 'register', component: RegistrationComponent},
  {path: 'login', component: LoginComponent},
  {path: 'portfolios/visiting', component: VisitingCardComponent},
  {path: 'portfolios/skills', component: SkillsPortfolioComponent},
  {path: 'portfolios/business', component: BusinessPortfolioComponent}
];

@NgModule({
    imports: [
      RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
  })

  export class AppRoutingModule {}
  export const routingComponents = [ProfileComponent, PortfoliosComponent,
                                    VisitingCardComponent, SkillsPortfolioComponent,
                                    BusinessPortfolioComponent,
                                    RegistrationComponent, LoginComponent];
