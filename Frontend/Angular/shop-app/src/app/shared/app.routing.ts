import { RouterModule } from "@angular/router";
import { ProductsComponent } from "../component/products/products.component";
import { CartComponent } from "../component/cart/cart.component";

export const AppRouting = RouterModule.forRoot([

    {path:'', redirectTo: 'products', pathMatch: 'full'},
    {path: 'products', component: ProductsComponent},
    {path: 'cart', component: CartComponent},
    
])