import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { RegServiceService } from '../shared/reg-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  userData: any[];

  constructor(private rs: RegServiceService) { 
  }

  ngOnInit(): void {
    
  }

  verifyUsers(ng: NgForm) {
    this.rs.loadUserFromDB().subscribe((data) => {
      const locArray = [];
      for(let key in data){
        locArray.push(data[key]);
      }
      if (this.userData[ng.value] in locArray) {
        canActivate:[true]
      }
    })
  }
}
