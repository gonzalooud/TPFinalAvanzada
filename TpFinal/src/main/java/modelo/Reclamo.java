package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "RECLAMO")
public class Reclamo implements Serializable {
    
   private static final long serialVersionUID = 1L;
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private int idReclamo;
   

   @ManyToOne
   @JoinColumn(name="DNI")
   private Cliente cliente;

   @ManyToMany
   @JoinColumn(name="IDSERVICIO")
   private Servicio servicio;
   
   @Column
   private String descripcion;
   
   @Column
   private String urgencia;
   
   @Column
   @Temporal(TemporalType.TIMESTAMP)
   private Date fecha;
   
   @ManyToOne
   @JoinColumn(name="DNI")
   private Empleado empleadoRegistro;
   
   @Column
   private Historial historial;
   
   @Column
   private TipoReclamo tipoReclamo;

   //CONTRUCTOR VACIO**********************************************************************************************
    
   public Reclamo() {
    }
    
   //CONSTRUCTOR RECLAMO****************************************************************************************** 

    public Reclamo(Cliente cliente, Servicio servicio, String descripcion, String urgencia, Date fecha,
            Empleado empleadoRegistro, Historial historial, TipoReclamo tipoReclamo) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.descripcion = descripcion;
        this.urgencia = urgencia;
        this.fecha = fecha;
        this.empleadoRegistro = empleadoRegistro;
        this.historial = historial;
        this.tipoReclamo = tipoReclamo;
    }
   
    //GETTERS************************************************************************************************************

    public int getIdReclamo() {
        return idReclamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public Empleado getEmpleadoRegistro() {
        return empleadoRegistro;
    }

    public Historial getHistorial() {
        return historial;
    }

    public TipoReclamo getTipoReclamo() {
        return tipoReclamo;
    }
    
    //SETTERS************************************************************************************************************

    public void setIdReclamo(int idReclamo) {
        this.idReclamo = idReclamo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEmpleadoRegistro(Empleado empleadoRegistro) {
        this.empleadoRegistro = empleadoRegistro;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public void setTipoReclamo(TipoReclamo tipoReclamo) {
        this.tipoReclamo = tipoReclamo;
    }
    
    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Reclamo{" + "idReclamo=" + idReclamo + ", cliente=" + cliente + ", servicio=" + servicio + ", descripcion=" + descripcion + ", urgencia=" + urgencia + ", fecha=" + fecha + ", empleadoRegistro=" + empleadoRegistro + ", historial=" + historial + ", tipoReclamo=" + tipoReclamo + '}';
    }
    
}
