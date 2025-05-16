import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import Cosmetico from '../model/cosmetico';

@Injectable({
  providedIn: 'root'
})
export class CosmeticoService {

  constructor(private http: HttpClient) { }

  public getCosmeticos(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/cosmeticos');
  }

  public postCosmetico(cosmetico:Cosmetico): Observable<Cosmetico> {
    return this.http.post<Cosmetico>('http://localhost:8080/cosmeticos', cosmetico);
  }

}
