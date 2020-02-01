package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "EMPLEADO")
public class Empleado implements Serializable {
    
    private static final long serialVersionUID = 1L;
  
    @Id
    @Column
    private int dni;
    
    @Column
    private String nombre;
    
    @Column
    private SimpleDateFormat fechaNacimiento;
    
    @OneToOne
    @JoinColumn
    private Contacto contacto;
    
    @Column
    private int numeroEmpleado;
    
    @Column
    private String usuario;
    
    @Column
    private String contraseña;
    
    @ManyToMany
    @JoinColumn
    private List <TipoReclamo> tipoReclamo=new ArrayList<>();

    //CONTRUCTOR VACIO*********************************************************************************************
    
    public Empleado() {
    }

    //CONSTRUCTOR EMPLEADO****************************************************************************************

    public Empleado(int dni, String nombre, SimpleDateFormat fechaNacimiento, int numeroEmpleado, String usuario, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroEmpleado = numeroEmpleado;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    //GETTERS************************************************************************************************************
    
    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public SimpleDateFormat getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public List<TipoReclamo> getTipoReclamo() {
        return tipoReclamo;
    }

    //SETTERS************************************************************************************************************
    
    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipoReclamo(List<TipoReclamo> tipoReclamo) {
        this.tipoReclamo = tipoReclamo;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(SimpleDateFormat fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", contacto=" + contacto + ", numeroEmpleado=" + numeroEmpleado + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", tipoReclamo=" + tipoReclamo + '}';
    }

}


