import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/service/cart.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css'],
})
export class CartComponent implements OnInit {
  public product: any = [];
  public grandTotal !: number;

  constructor(private cs: CartService) {}

  ngOnInit(): void {
    this.cs.getProducts().subscribe((res) => {
      this.product = res;
      this.grandTotal = this.cs.getTotalPrice();
    });
  }
  removeItem(item: any) {
    this.cs.removeCartItem(item);
  }
  emptycart() {
    this.cs.removeAllCart()
  }
}
