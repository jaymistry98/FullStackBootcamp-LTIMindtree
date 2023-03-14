import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { CartComponent } from './component/cart/cart.component';
import { ProductsComponent } from './component/products/products.component';
import { HttpClientModule } from '@angular/common/http'
import { AppRouting } from './shared/app.routing'

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CartComponent,
    ProductsComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, AppRouting
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
