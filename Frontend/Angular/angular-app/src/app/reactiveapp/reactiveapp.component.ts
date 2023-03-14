import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { RegServiceService } from '../shared/reg-service.service';

@Component({
  selector: 'app-reactiveapp',
  templateUrl: './reactiveapp.component.html',
  styleUrls: ['./reactiveapp.component.css']
})
export class ReactiveappComponent implements OnInit {

  userData: any[];

  myform: FormGroup;
  uname: FormControl;
  pass: FormControl;
  email: FormControl;
  dept: FormControl;
  city: FormControl;
  country: FormControl;

  createForm(){
    this.myform = new FormGroup({
      uname: this.uname,
      pass: this.pass,
      email: this.email,
      dept: this.dept,
      city: this.city,
      country: this.country,
    })
  }

  createFormControls(){
    this.uname = new FormControl('', Validators.required);
    this.pass = new FormControl('', [Validators.required, Validators.minLength(6)]);
    this.email = new FormControl('', [Validators.required, Validators.email]);
    this.dept = new FormControl('', Validators.required);
    this.city = new FormControl('', Validators.required);
    this.country = new FormControl('', Validators.required);
  }

  /* addUser(){
    console.log(this.myform.value);
  } */


  constructor(private rs: RegServiceService) {}

  ngOnInit(): void {
    this.createFormControls();
    this.createForm();
  }

  addUser(){
    console.log();
    this.rs.addUserToDB(this.myform.value)
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
