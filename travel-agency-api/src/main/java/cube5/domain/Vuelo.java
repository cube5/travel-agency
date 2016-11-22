package cube5.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Vuelo implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "vuelo_id")
    private Long id;
    
    @Column(name = "origen", nullable = false, length = 100)
    private String origen;
    
    @Column(name = "destino", nullable = false, length = 100)
    private String destino;
    
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    @Column(name = "fecha_salida", nullable = false)
    private Date fechaSalida;
    
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    @Column(name = "fecha_regreso", nullable = false)
    private Date fechaRegreso;
    
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
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "vuelo")
    private List<Venta> ventas;
    
    public Vuelo() {}
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    public String getDestino() {
        return destino;
    }
    
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public Date getFechaSalida() {
        return fechaSalida;
    }
    
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    public Date getFechaRegreso() {
        return fechaRegreso;
    }
    
    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }
    
    public Date getCreatedDate() {
        return createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    public String getCreatedBy() {
        return createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
    public Date getUpdatedDate() {
        return updatedDate;
    }
    
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
    public String getUpdatedBy() {
        return updatedBy;
    }
    
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
