import { Component } from '@angular/core';
import { Suplement } from 'src/app/models/suplements';

@Component({
  selector: 'app-list-products',
  templateUrl: './list-products.component.html',
  styleUrls: ['./list-products.component.css']
})
export class ListProductsComponent {
  suplements : Suplement [] = new Array <Suplement> ()

  constructor() {
    this.suplements.push(new Suplement("Isaac", 1, false, "https://avatars.githubusercontent.com/u/124640429?v=4"))
    this.suplements.push(new Suplement("Matheus", 2, true, "https://avatars.githubusercontent.com/u/61809283?v=4"))
    this.suplements.push(new Suplement("Miguel", 3, false, "https://avatars.githubusercontent.com/u/57414379?v=4"))
    this.suplements.push(new Suplement("Paulo", 4, true, "https://avatars.githubusercontent.com/u/101016549?v=4"))
    this.suplements.push(new Suplement("Ryan", 5, true, "https://avatars.githubusercontent.com/u/124525502?v=4"))
    this.suplements.push(new Suplement("gabriel",6,false,"https://media.licdn.com/dms/image/D4D03AQE8_liIrCPLPg/profile-displayphoto-shrink_800_800/0/1683509524869?e=1697068800&v=beta&t=HmAjUPssuD9hRbv1aiRdAuF3vOL4Z-XqjHVdiDVyPrU"))
  }
}
