import { NgModule, Component } from '@angular/core';
import { BrowserModule }  from '@angular/platform-browser';

import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { VentaModule } from './ventas/venta.module';

import { VentaComponent } from './ventas/venta.component';

@Component({
  template: `
  <ul class="nav">
    <li class="nav-item">
      <a routerLink="ventas">Mostrar ventas</a>
    </li>
  </ul>
  `
})
export class HomeComponent {}

const routes = [
  { path: '', component: HomeComponent },
  { path: 'ventas', component: VentaComponent }
]

@NgModule({
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    VentaModule
  ],
  declarations: [ AppComponent, HomeComponent ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }
