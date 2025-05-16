import { Component } from '@angular/core';
import Cosmetico from 'src/app/model/cosmetico';
import { CosmeticoService } from 'src/app/service/cosmetico-service.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent {

  cosmetico!: Cosmetico;

  id!: number;
  nome!: String;
  preco!: number;
  image!: String;

  constructor(private service: CosmeticoService) { }

  postProduto() {
    let cosmetico: Cosmetico = new Cosmetico(this.id, this.nome, this.preco, this.image)

    this.service.postCosmetico(cosmetico).subscribe((response: Cosmetico) => {
      return response;
    })
  }



}
