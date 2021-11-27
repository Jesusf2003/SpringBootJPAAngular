import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UbigeoComponent {

  private API_SERVER = "http://localhost:8081/ubigeo/";

  constructor(private httpClient: HttpClient) { }

  public getAllUbigeo(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }
}
