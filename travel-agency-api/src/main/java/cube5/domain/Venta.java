package cube5.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Venta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "venta_id")
    private Long id;
    
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id", referencedColumnName = "cliente_id", nullable = false)
    private Cliente cliente;
    
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "vuelo_id", referencedColumnName = "vuelo_id", nullable = false)
    private Vuelo vuelo;
    
    @Column(name = "asiento", nullable = false)
    private String asiento;
    
    @CreatedDate
    @Column(name = "created_date", nullable = true)
    private Date createdDate;
    
    @CreatedBy
    @Column(name = "created_by", nullable = true, length = 100)
    private String createdBy;
    
    @Column(name = "updated_date", nullable = true)
    private Date updatedDate;

    @Column(name = "updated_by", nullable = true, length = 100)
    private String updatedBy;
    
    public Venta() {}    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Vuelo getVuelo() {
        return vuelo;
    }
    
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    public String getAsiento() {
        return asiento;
    }
    
    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    
}
