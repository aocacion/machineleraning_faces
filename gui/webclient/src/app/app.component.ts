import { Component } from '@angular/core';
import { Servicio1 } from './Servicio1.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers:[Servicio1]
})
export class AppComponent {
  title = 'webclient';
  nombre : String = 'Alexis';
  deshabilitar=false;
  titulo = '';
  tituloNg = 'Hola Mundo';
  mostrar : boolean = false;
  entradaText : string = 'ini';
  entradaText1 : string = '';
  contador : number = 0;

  constructor(private servicio1:Servicio1){}

  capturarClick() {
    this.nombre="Alexis cambio";
    this.deshabilitar=true;
  }
  modificarTitulo($event : Event) {
    this.contador = this.contador + 1;
    this.titulo=(<HTMLInputElement>$event.target).value;
    this.entradaText1='Cambiado ' + this.contador + " - " + this.entradaText;
    this.servicio1.enviaMensajeAConsola('Valor contador1 ' + this.contador);
  }
}
