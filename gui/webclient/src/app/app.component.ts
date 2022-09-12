import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webclient';
  nombre : String = 'Alexis';
  deshabilitar=false;
  titulo = '';
  tituloNg = 'Hola Mundo';
  mostrar : boolean = false;
  entradaText : string = '';
  entradaText1 : string = '';

  capturarClick() {
    this.nombre="Alexis cambio";
    this.deshabilitar=true;
  }
  modificarTitulo($event : Event) {
    this.titulo=(<HTMLInputElement>$event.target).value;
    this.entradaText1='Cambiado' + this.entradaText;
  }
}
