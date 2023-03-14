import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegServiceService {

  userData: FormData[]=[]

  constructor(private http:HttpClient) { 

  }

  /* addUserToDB(data:any) {
    
    this.userData.push(data)
    this.http.post('https://jay-angular-default-rtdb.firebaseio.com/mydata.json',data)
    .subscribe((data) =>{
      console.log(data);

    })
    
  }
  loadUserFromDB(){
    return this.http.get('https://jay-angular-default-rtdb.firebaseio.com/mydata.json')
    
  } */

  addUserToDB(data:any) {
    
    this.userData.push(data)
    this.http.post('http://localhost:8045/mainapp/register/',data)
    .subscribe((data) =>{
      console.log(data);

    })
    
  }
  loadUserFromDB(){
    return this.http.get('http://localhost:8045/mainapp/loadusers/')
    
  }

}

// https://jay-angular-default-rtdb.firebaseio.com/

//http://localhost:57883/