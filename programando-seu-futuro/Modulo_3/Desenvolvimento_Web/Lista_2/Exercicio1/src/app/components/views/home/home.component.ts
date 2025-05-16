import { Component } from '@angular/core';
import Analista from 'src/app/models/analista';
import Gestor from 'src/app/models/gestor';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  public analista: Analista[] = new Array<Analista>();
  public gestor: Gestor = new Gestor("Lilian", 1, "Sócia", [])

  constructor() {
    this.analista.push(new Analista("A", 1, "A", "A"));
    this.analista.push(new Analista("B", 2, "B", "B"));
    this.analista.push(new Analista("C", 3, "C", "C"));
    this.analista.push(new Analista("D", 4, "D", "D"));
    this.analista.push(new Analista("E", 5, "E", "E"));
    this.analista.push(new Analista("F", 6, "F", "F"));
    this.analista.push(new Analista("G", 7, "G", "G"));
  }
}
