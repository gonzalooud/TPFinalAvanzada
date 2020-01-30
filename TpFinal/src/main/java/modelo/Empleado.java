package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "EMPLEADO")
@PrimaryKeyJoinColumn(name="PersonaId")
public class Empleado extends Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
  
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

    public Empleado(int dni, String nombre, SimpleDateFormat fechaNacimiento, Contacto contacto,
            int numeroEmpleado, String usuario, String contraseña, List<TipoReclamo> tipoReclamo) {
        super(dni, nombre, fechaNacimiento, contacto);
        this.numeroEmpleado = numeroEmpleado;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipoReclamo = tipoReclamo;
    }
    


    //GETTERS************************************************************************************************************

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

    

    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Empleado{" + "numeroEmpleado=" + numeroEmpleado + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", tipoReclamo=" + tipoReclamo + '}';
    }

  
    
}


