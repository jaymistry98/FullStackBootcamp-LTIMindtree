import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-clientlist',
  templateUrl: './clientlist.component.html',
  styleUrls: ['./clientlist.component.css']
})
export class ClientlistComponent implements OnInit {

  clientList = ["LTI", "Wells Fargo", "TCS", "Tesla"]

  constructor() { }

  ngOnInit(): void {
  }

}
