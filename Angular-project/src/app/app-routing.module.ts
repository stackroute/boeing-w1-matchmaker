import {NgModule} from '@angular/core';
import {Routes , RouterModule, Router} from '@angular/router';
import { ProfileComponent } from './profile/profile.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './guards/auth.guard';
import { PortfoliosComponent } from './portfolios/portfolios.component';
import { HomeComponent } from './home/home.component';
import { StartComponent } from './start/start.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { HelpComponent } from './help/help.component';
import { ContactComponent } from './contact/contact.component';

const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'profile', component: ProfileComponent},
  {path: 'portfolios', component: PortfoliosComponent},
  {path: 'register', component: RegistrationComponent},
  {path: 'login', component: LoginComponent},
  {path: 'about', component: AboutUsComponent },
  {path: 'help', component: HelpComponent },
  {path: 'contact', component: ContactComponent }
  ];
@NgModule({
    imports: [
      RouterModule.forRoot(routes)
    ],
    exports: [RouterModule]
  })

  export class AppRoutingModule {}
  export const routingComponents = [ProfileComponent, PortfoliosComponent, RegistrationComponent, LoginComponent,
     StartComponent, ContactComponent, HelpComponent, AboutUsComponent];
