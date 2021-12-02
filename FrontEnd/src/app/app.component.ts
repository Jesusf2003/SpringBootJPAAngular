import { Component, OnInit, EventEmitter, Output, ViewChild, ElementRef } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { PersonaComponent } from './services/persona/persona.component';
import { Persona } from './services/persona/persona.modelo';
import { UbigeoComponent } from './services/ubigeo/ubigeo.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Sistema de prueba';
  
  constructor(
  ) { }

  ngOnInit(): void {
  }
}
