import { Component, OnInit } from '@angular/core';
import AnimalModel from 'src/app/model/animalModel';
import { AnimalService } from 'src/app/service/animal.service';

@Component({
  selector: 'app-lista-animais',
  templateUrl: './lista-animais.component.html',
  styleUrls: ['./lista-animais.component.css']
})
export class ListaAnimaisComponent implements OnInit {
  public animais!: AnimalModel[];

  constructor(private serviceAnimal: AnimalService) { }

  ngOnInit(): void {
    this.serviceAnimal.getAnimais().subscribe((response: AnimalModel[]) => {
      this.animais = response;
    })
  }
}
