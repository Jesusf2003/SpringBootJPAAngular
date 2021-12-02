import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Persona } from "./persona.modelo";

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  private API_SERVER = "http://localhost:8081/persona/";

  /*
    Los métodos deben llamarse igual que en springboot

    GET es para listar
    POST es para registrar
  */

  constructor (
    private httpClient:HttpClient
  ) { }

  public getAllPersonas(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

  public savePersona(persona: Persona): Observable<any>{
    console.log(persona);
    return this.httpClient.post(this.API_SERVER, persona);
  }
}
