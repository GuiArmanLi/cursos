import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

  public pokemons: any[] = [];
  public urls: string[] = [];
  
  constructor(private service: ServiceService){}
  
  ngOnInit(): void {
    this.service.getPokemons().subscribe((response: any) => {

      for(let pokemon of response.results){
        this.service.getInfoPokemon(pokemon.name).subscribe((res: any) => {
          this.pokemons.push(res)
        })
      }
    })
  }
}
