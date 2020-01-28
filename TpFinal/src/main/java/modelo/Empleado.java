package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    
    @Column
    @ManyToMany
    private ArrayList <TipoReclamo> tipoReclamo;

    //CONTRUCTOR VACIO*********************************************************************************************
    
    public Empleado() {
    }

    //CONSTRUCTOR EMPLEADO****************************************************************************************
    
    public Empleado(int numeroEmpleado, String usuario, String contraseña) {
        this.numeroEmpleado = numeroEmpleado;
        this.usuario = usuario;
        this.contraseña = contraseña;
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


    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Empleado{" + "numeroEmpleado=" + numeroEmpleado + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", especialidad=" + '}';
    }
    
}


