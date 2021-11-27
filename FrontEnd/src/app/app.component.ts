import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PersonaComponent } from './services/persona/persona.component';
import { UbigeoComponent } from './services/ubigeo/ubigeo.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Sistema de prueba';

  personaForm!: FormGroup;
  persona: any;
  ubigeo: any;
  constructor(
    public fb: FormBuilder,
    public UbigeoService: UbigeoComponent,
    public PersonaService: PersonaComponent
  ) { }

  ngOnInit(): void {
    this.personaForm = this.fb.group({
      id: ['', Validators.required],
      nomper: ['', Validators.required],
      apeper: ['', Validators.required],
      userper: ['', Validators.required],
      pswdper: ['', Validators.required],
      dirper: ['', Validators.required],
      emaper: ['', Validators.required],
      dniper: ['', Validators.required],
      celper: ['', Validators.required],
      rolper: ['', Validators.required],
      codubi: ['', Validators.required],
      estper: ['', Validators.required]
    });

    this.PersonaService.getAllPersonas().subscribe(resp => {
      this.persona = resp;
    },
      error => { console.error(error)}
    );

    this.UbigeoService.getAllUbigeo().subscribe(resp => {
      this.ubigeo = resp;
    },
      error => { console.error(error) }
    );
  }
}
