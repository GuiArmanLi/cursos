import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import AnimalModel from '../model/animalModel';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {

  constructor(private http: HttpClient) {}
  
    public getAnimais(): Observable <AnimalModel[]> {
      return this.http.get<AnimalModel[]>(`http://localhost:8080/animal/getAll`);
    }
  
    public postAnimal(animal: AnimalModel): Observable <AnimalModel> {
      return this.http.post<AnimalModel>(`http://localhost:8080/animal/postAnimal`, animal);
    }
}
