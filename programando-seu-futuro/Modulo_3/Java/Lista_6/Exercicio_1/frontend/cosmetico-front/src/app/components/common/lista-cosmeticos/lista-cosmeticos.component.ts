import { Component, OnInit } from '@angular/core';
import { CosmeticoService } from 'src/app/service/cosmetico-service.service';

@Component({
  selector: 'app-lista-cosmeticos',
  templateUrl: './lista-cosmeticos.component.html',
  styleUrls: ['./lista-cosmeticos.component.css']
})
export class ListaCosmeticosComponent implements OnInit {
  public cosmeticos!: Array<any>;


  constructor(private service: CosmeticoService) { }
  ngOnInit(): void {
    this.service.getCosmeticos().subscribe((response: any) => {
      
      this.cosmeticos = response;
    })
  }
}
