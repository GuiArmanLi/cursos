import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/views/home/home.component';
import { PersonalPageComponent } from './components/views/personal-page/personal-page.component';
import { ListProductsComponent } from './components/views/list-products/list-products.component';
import { ContactUsComponent } from './components/views/contact-us/contact-us.component';

const routes: Routes = [{
  path: "",
  component: HomeComponent
},
{
  path: "list-products",
  component: ListProductsComponent
},
{
  path: "personal-page",
  component: PersonalPageComponent
},
{
  path: "contact-us",
  component: ContactUsComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}