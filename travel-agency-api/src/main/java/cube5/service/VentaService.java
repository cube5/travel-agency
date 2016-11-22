package cube5.service;

import java.util.List;

import cube5.domain.Venta;

public interface VentaService {
    List<Venta> findAll();
    
    Venta save(Venta venta);
}
