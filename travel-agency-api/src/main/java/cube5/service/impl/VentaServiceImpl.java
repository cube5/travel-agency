package cube5.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cube5.domain.Venta;
import cube5.repository.VentaRepository;
import cube5.service.VentaService;

@Service
public class VentaServiceImpl implements VentaService {
    
    @Autowired
    private VentaRepository ventaRepository;
    
    @Override
    public List<Venta> findAll() {
        return ventaRepository.findAll();
    }
}
