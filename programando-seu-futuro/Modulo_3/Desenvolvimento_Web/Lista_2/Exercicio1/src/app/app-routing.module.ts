import { NgModule } from '@angular/core';
import { HomeComponent } from './components/views/home/home.component';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/views/login/login.component';
import { AboutMeComponent } from './components/views/about-me/about-me.component';
import { CavaloComponent } from './components/common/cavalo/cavalo.component';


const routes:Routes = [
  {path:'app-home', component:HomeComponent},
  {path:'app-login', component: LoginComponent},
  {path:'app-cavalo', component: CavaloComponent}
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
