import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Persona } from 'src/app/componentes/persona/persona.modelo';
import { Ubigeo } from 'src/app/componentes/ubigeo/ubigeo.modelo';
import { UbigeoService } from '../ubigeo/ubigeo.injection';
import { PersonaService } from './persona.injection';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {

  personaForm!:FormGroup;
  persona:any;
  ubigeo:any;
  id!:number;

  constructor(
    public fb:FormBuilder,
    public personaService:PersonaService,
    public ubigeoService:UbigeoService
  ) { }

  ngOnInit(): void {
    this.personaForm = this.fb.group({
      codper: [''],
      nomper: ['', Validators.required],
      apeper: ['', Validators.required],
      userper: ['', Validators.required],
      pswdper: ['', Validators.required],
      dirper: ['', Validators.required],
      emaper: ['', Validators.required],
      dniper: ['', Validators.required],
      celper: ['', Validators.required],
      rolper: ['', Validators.required],
      ubigeo: ['', Validators.required],
      estper: ['', Validators.required]
    });
    this.personaService.getAllPersonas().subscribe(
      resp => {
        this.persona = resp;
      },
      error => {
        console.log(error);
      }
    );
    this.ubigeoService.getAllUbigeo().subscribe(
      resp => {
        this.ubigeo = resp;
      },
      error => {
        console.error(error);
      }
    )
  }

  agregarPersona():void {

    const ubigeo = new Ubigeo();
    ubigeo.codubi = this.form['ubigeo'].value;

    const persona = new Persona();
    persona.nomper = this.form['nomper'].value;
    persona.apeper = this.form['apeper'].value;
    persona.userper = this.form['userper'].value;
    persona.pswdper = this.form['pswdper'].value;
    persona.dirper = this.form['dirper'].value;
    persona.emaper = this.form['emaper'].value;
    persona.dniper = this.form['dniper'].value;
    persona.celper = this.form['celper'].value;
    persona.rolper = this.form['rolper'].value;
    persona.ubigeo = ubigeo;
    persona.estper = this.form['estper'].value;

    console.log(persona);

    this.personaService.savePersona(persona).subscribe(
      resp => {
        this.personaForm.reset();
        this.persona.filter();
        this.persona.push(resp);
      }, error => {
        console.log(error);
      }
    )
  }

  openModal(id:Persona) {
    console.log(this.id);
  }

  cargarPersona(persona:Persona) {
    console.log(persona);
    this.personaService.personaSelected = persona;
  }

  eliminarPersona(persona:Persona) {
    console.log(persona);
    console.log(persona.codper);
    this.personaService.deletePersona(persona.codper).subscribe(
      resp => {
        console.log(resp);
        if (resp === true) {
          this.persona.pop(persona);
        }
      }
    );
  }

  modificarPersona(persona:Persona) {
    const ubigeo = new Ubigeo();
    this.personaForm.setValue({
      codper:persona.codper,
      nomper:persona.nomper,
      apeper:persona.apeper,
      userper:persona.userper,
      pswdper:persona.pswdper,
      dirper:persona.dirper,
      emaper:persona.emaper,
      dniper:persona.dniper,
      celper:persona.celper,
      rolper:persona.rolper,
      codubi:ubigeo.codubi,
      estper:persona.estper
    });
  }

  get form() {
    return this.personaForm.controls;
  }

}
