import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/service/api.service';
import { CartService } from 'src/app/service/cart.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css'],
})
export class ProductsComponent implements OnInit {
  public prodList: any;
  constructor(private as: ApiService, private cs:CartService) {}

  ngOnInit(): void {
    this.as.getProducts().subscribe((res) => {
      this.prodList = res;
      this.prodList.forEach((a:any) => {
        Object.assign(a,{quantity:1,total:a.price})
      })
    });
  }
  addToCart(item:any){
    this.cs.addToCart(item)

  }
}




