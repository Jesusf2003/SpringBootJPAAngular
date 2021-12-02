import { Ubigeo } from "../ubigeo/ubigeo.modelo";

export class Persona {
  constructor(
    public codper:number,
    public nomper:string,
    public apeper:string,
    public userper:string,
    public pswdper:string,
    public dirper:string,
    public emaper:string,
    public dniper:string,
    public celper:string,
    public rolper:string,
    public codubi:Ubigeo,
    public estper:string
  ) {}
}
