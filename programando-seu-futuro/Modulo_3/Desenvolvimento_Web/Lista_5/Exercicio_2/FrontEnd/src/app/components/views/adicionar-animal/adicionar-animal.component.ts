import { Component, OnInit } from '@angular/core';
import AnimalModel from 'src/app/model/animalModel';
import { AnimalService } from 'src/app/service/animal.service';

@Component({
  selector: 'app-adicionar-animal',
  templateUrl: './adicionar-animal.component.html',
  styleUrls: ['./adicionar-animal.component.css']
})
export class AdicionarAnimalComponent {
  constructor(private service: AnimalService) { }
  public id!: number;
  public name!: String;
  public raca!: String;

  public postAnimal(){
    let animal = new AnimalModel(this.id, this.name, this.raca);

    this.service.postAnimal(animal).subscribe((animal: AnimalModel) => {
      
      console.log(animal);
      return animal;
    })
  }
}
