import { NgModule } from "@angular/core";
import { Routes, RouterModule, Router } from "@angular/router";
import { ProfileComponent } from "./profile/profile.component";
import { RegistrationComponent } from "./registration/registration.component";
import { LoginComponent } from "./login/login.component";
import { AuthGuard } from "./guards/auth.guard";
import { PortfoliosComponent } from "./portfolios/portfolios.component";
import { VisitingCardComponent } from "./portfolios/visiting-card/visiting-card.component";
import { SocialMediaComponent } from "./portfolios/social-media/social-media.component";
import { HomeComponent } from "./home/home.component";
import { SkillPortfolioComponent } from "./portfolios/skill-portfolio/skill-portfolio.component";
import { AboutUsComponent } from "./about-us/about-us.component";
import { HelpComponent } from "./help/help.component";
import { ContactComponent } from "./contact/contact.component";

const routes: Routes = [
  { path: "home", component: HomeComponent },
  { path: "profile", component: ProfileComponent },
  { path: "portfolios", component: PortfoliosComponent },
  { path: "register", component: RegistrationComponent },
  { path: "", component: LoginComponent },
  { path: "portfolios/visiting", component: VisitingCardComponent },
  { path: "portfolios/socialmedia", component: SocialMediaComponent },
  { path: "portfolios/skill", component: SkillPortfolioComponent },
  { path: "about", component: AboutUsComponent },
  { path: "help", component: HelpComponent },
  { path: "contact", component: ContactComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
export const routingComponents = [
  ProfileComponent,
  PortfoliosComponent,
  VisitingCardComponent,
  SocialMediaComponent,
  RegistrationComponent,
  LoginComponent
];
