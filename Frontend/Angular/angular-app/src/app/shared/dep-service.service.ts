import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DepServiceService {

  public loadDepartments(): string[]{
    return ['finance', 'hr', 'marketing']
  }

  constructor() { }
}
