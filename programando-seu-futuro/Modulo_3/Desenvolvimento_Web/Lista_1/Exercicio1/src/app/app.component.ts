import { Component } from '@angular/core';
import Analista from './models/analista';
import Gestor from './models/gestor';
import Peao from './models/peao';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Exercicio1';
  
  public analista: Analista[] = new Array<Analista>();
  public peao: Peao[] = new Array<Peao>();
  public gestor: Gestor = new Gestor("Lilian", 1, "Socia", [])

  constructor() {
    //Peao
    this.peao.push(new Peao("Guilherme", 1, "Legalizacao / Financeiro", this.analista))
    this.peao.push(new Peao("Emelly", 2, "DP", this.analista))
    this.peao.push(new Peao("Alice", 3, "Fiscal", this.analista))

    //Analista
    this.analista.push(new Analista("Adriana", 1, "Legalizacao / DP", this.gestor.nome, this.peao))
    this.analista.push(new Analista("Brenda", 2, "Fiscal", this.gestor.nome, this.peao))
    this.analista.push(new Analista("Eder", 3 ,"Financeiro", this.gestor.nome, this.peao))
    this.analista.push(new Analista("Jose", 4 ,"TI", this.gestor.nome, this.peao))
  }
}
