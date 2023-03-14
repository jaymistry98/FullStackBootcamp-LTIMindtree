import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  public loadUsers(): string[]{
    return ['admin', 'manager', 'qa']
  }

  constructor() { }
}
