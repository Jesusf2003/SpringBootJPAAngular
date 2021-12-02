import { Observable } from "rxjs";
import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Persona } from "./persona.modelo";

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  private API_SERVER = "http://localhost:8081/persona/";

  personaSelected = new Persona();

  /*
    Los métodos deben llamarse igual que en springboot

    GET es para listar
    POST es para registrar
    DELETE es para eliminar de la
    base de datos(Valga la redundancia)
    PUT es para modificar
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

  public deletePersona(id:number):Observable<any>{
    return this.httpClient.delete(this.API_SERVER + id);
  }
}
