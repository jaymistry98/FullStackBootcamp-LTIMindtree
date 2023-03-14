import { RouterModule } from "@angular/router";
import { LoginComponent } from "../login/login.component";
import { Component } from "@angular/core";
import { RegistrationComponent } from "../registration/registration.component";
import { UserdetailsComponent } from "../userdetails/userdetails.component";
import { PortfolioComponent } from "../portfolio/portfolio.component";
import { UserservicesComponent } from "../userservices/userservices.component";
import { Guard } from "./guard.service";

export const AppRouter = RouterModule.forRoot([

    {path: 'login', component: LoginComponent},
    {path: 'register', component: RegistrationComponent},
    {path: 'userdetails', component: UserdetailsComponent},
    {path: 'portfolio', component: PortfolioComponent},
    {path: 'userservices', component: UserservicesComponent, canActivate:[Guard]}
])