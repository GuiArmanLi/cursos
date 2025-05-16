import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/views/home/home.component';
import { AdicionarAnimalComponent } from './components/views/adicionar-animal/adicionar-animal.component';

const routes: Routes = [
  {path: 'app-home', component: HomeComponent},
  {path: 'app-adicionar-animal', component: AdicionarAnimalComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
