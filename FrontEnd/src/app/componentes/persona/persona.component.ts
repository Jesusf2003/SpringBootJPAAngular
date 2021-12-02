import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Persona } from 'src/app/services/persona/persona.modelo';
import { Ubigeo } from 'src/app/services/ubigeo/ubigeo.modelo';
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

  constructor(
    public fb:FormBuilder,
    public personaService:PersonaService,
    public ubigeoService:UbigeoService
  ) { }

  ngOnInit(): void {
    this.personaForm = this.fb.group({
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
    this.personaService.savePersona(this.personaForm.value).subscribe(
      resp => {
      }, error => {
        console.log(error);
      }
    )
  }

}
