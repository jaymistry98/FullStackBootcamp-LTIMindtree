import { Component, ComponentFactoryResolver, OnInit } from '@angular/core';
import { RegServiceService } from '../shared/reg-service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit{
  
  userData: any[];

  constructor(private rs: RegServiceService) { 
  }

  ngOnInit(): void {
    
  }

  addUser(ng: NgForm){
    console.log();
    this.rs.addUserToDB(ng.value)
  }

  loadUsers() {
    this.rs.loadUserFromDB().subscribe((data) => {
      const locArray = [];
      for(let key in data){
        locArray.push(data[key]);
      }
      this.userData = locArray;
    })
  }
}



