import { Injectable }     from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';
import { Venta }           from '../ventas/venta.model';
import { Observable }     from 'rxjs/Observable';

@Injectable()
export class VentaService {
  private ventasUrl = 'http://localhost:8081/ventas';
  constructor (private http: Http) {}
  
  getVentas (): Observable<Venta[]> {
    return this.http.get(this.ventasUrl)
                    .map(this.extractData)
                    .catch(this.handleError);
  }
  
  createVenta (venta: Venta): Observable<Venta> {
    let headers = new Headers({ 'Content-Type': 'application/json' });
    let options = new RequestOptions({ headers: headers });

    return this.http.post(this.ventasUrl, { venta }, options)
                    .map(this.extractData)
                    .catch(this.handleError);
  }
  
  private extractData(res: Response) {
    console.log('response: ', res);
    let body = res.json();
    return body || { };
  }
  private handleError (error: Response | any) {
    // In a real world app, we might use a remote logging infrastructure
    let errMsg: string;
    if (error instanceof Response) {
      const body = error.json() || '';
      const err = body.error || JSON.stringify(body);
      errMsg = `${error.status} - ${error.statusText || ''} ${err}`;
    } else {
      errMsg = error.message ? error.message : error.toString();
    }
    console.error(errMsg);
    return Observable.throw(errMsg);
  }
}
