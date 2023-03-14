import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

const appRoutes: Routes = [
  { path: "", redirectTo: "/recipes", pathMatch: "full" },
  {
    path: "recipes",
    loadChildren: () =>
      import("./recipes/recipes.module").then(m => m.RecipesModule)
  },
  {
    path: "shopping-list",
    loadChildren: () =>
      import("./shopping-list/shopping-list.module").then(
        m => m.ShoppingListModule
      )
  },
  {
    path: "auth",
    loadChildren: () => import("./auth/auth.module").then(m => m.AuthModule)
  },
  {
    path: "services",
    loadChildren: () => import("./services/services.module").then(m => m.ServicesModule)
  },
  {
    path: "locations",
    loadChildren: () => import("./locations/locations.module").then(m => m.LocationsModule)
  },
  {
    path: "clientlist",
    loadChildren: () => import("./clientlist/clientlist.module").then(m => m.ClientListModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
