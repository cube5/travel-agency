import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common'; 
import { VentaComponent } from './venta.component';

import { FormsModule } from '@angular/forms';
import { HttpModule, JsonpModule } from '@angular/http';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    HttpModule,
    JsonpModule
  ],
  declarations: [ VentaComponent ],
  exports: [ VentaComponent ]
})
export class VentaModule { }
