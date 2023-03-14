import { CanActivate } from "@angular/router";



export class Guard implements CanActivate {

    canActivate(){

        alert('not authorized to access this')
        return false;
    
    }
}