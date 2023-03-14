import { Component, OnInit } from '@angular/core';
import { DepServiceService } from '../shared/dep-service.service';
import { UserServiceService } from '../shared/user-service.service';

@Component({
  selector: 'app-mainapp',
  templateUrl: './mainapp.component.html',
  styleUrls: ['./mainapp.component.css']
})
export class MainappComponent implements OnInit {

  userData: any[];
  depData: any[];

  constructor(private ud: UserServiceService, private dd: DepServiceService) { 
    this.userData = this.ud.loadUsers();
    this.depData = this.dd.loadDepartments();
  }

  ngOnInit(): void {
    
  }
}
