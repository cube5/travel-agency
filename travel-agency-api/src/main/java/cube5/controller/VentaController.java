package cube5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cube5.domain.Venta;
import cube5.service.VentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    
    @Autowired
    private VentaService ventasService;
    
    @RequestMapping
    public ResponseEntity<List<Venta>> findVentas() {
        return ResponseEntity.ok(ventasService.findAll());
    }
}
