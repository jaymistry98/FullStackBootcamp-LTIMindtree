import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-locations',
  templateUrl: './locations.component.html',
  styleUrls: ['./locations.component.css']
})
export class LocationsComponent implements OnInit {

  locationList = ["New York", "Los Angeles", "Miami", "Dallas"]

  constructor() { }

  ngOnInit(): void {
  }

}
