import { Component , OnInit } from '@angular/core';
import { ApiService } from 'src/app/service/api.service';
import { CartService } from 'src/app/service/cart.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit{

  public totalItem: number = 0
  constructor(private as: ApiService, private cs: CartService){

  }

  ngOnInit(): void {
    this.cs.getProducts().subscribe(res => {
      this.totalItem = res.length
    })
  }
}
