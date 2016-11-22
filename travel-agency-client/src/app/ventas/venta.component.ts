import { Component, OnInit } from '@angular/core';

import { Venta } from './venta.model';
import { VentaService } from '../core/venta.service.ts';

@Component({
  selector: 'app-ventas',
  providers: [ VentaService ],
  templateUrl: './venta.component.html',
  styleUrls: ['./venta.component.css']
})
export class VentaComponent implements OnInit {
  errorMessage: string;
  ventas: Venta[];
  mode = 'Observable';
  constructor (private ventaService: VentaService) {}
  ngOnInit() { this.getVentas(); }
  getVentas() {
    this.ventaService.getVentas()
                     .subscribe(
                       ventas => this.ventas = ventas,
                       error =>  this.errorMessage = <any>error);
  }
  onSubmit (formValue: { clienteId: number, vueloId: number, asiento: string }) {
    if (!formValue.clienteId) { return; }
    if (!formValue.vueloId) { return; }
    if (!formValue.asiento) { return; }
    let venta = {
      cliente: { id: formValue.clienteId },
      vuelo: { id: formValue.vueloId },
      asiento: formValue.asiento
    }
    this.ventaService.createVenta(venta)
                     .subscribe(
                       venta  => this.ventas.push(venta),
                       error =>  this.errorMessage = <any>error);
  }
}
