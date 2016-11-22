package cube5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cube5.domain.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
