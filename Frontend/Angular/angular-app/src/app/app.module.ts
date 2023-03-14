import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainappComponent } from './mainapp/mainapp.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { RegistrationComponent } from './registration/registration.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ReactiveappComponent } from './reactiveapp/reactiveapp.component';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { LoginComponent } from './login/login.component';
import { UserdetailsComponent } from './userdetails/userdetails.component';
import { PortfolioComponent } from './portfolio/portfolio.component';
import { RegistrationsComponent } from './registrations/registrations.component'
import { AppRouter } from './shared/app.routing';
import { UserservicesComponent } from './userservices/userservices.component';
import { Guard } from './shared/guard.service';

@NgModule({
  declarations: [
    AppComponent,
    MainappComponent,
    HeaderComponent,
    FooterComponent,
    RegistrationComponent,
    ReactiveappComponent,
    LandingpageComponent,
    LoginComponent,
    UserdetailsComponent,
    PortfolioComponent,
    RegistrationsComponent,
    UserservicesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    AppRouter,
  ],
  providers: [Guard],
  bootstrap: [AppComponent]
})
export class AppModule { }
