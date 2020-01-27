package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "EMPLEADO")
@PrimaryKeyJoinColumn(name="PersonaId")
public class Empleado extends Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
   

    @Column
    private int NumeroEmpleado;
    
    @Column
    private String Usuario;
    
    @Column
    private String Contraseña;

    //CONTRUCTOR VACIO*********************************************************************************************
    
    public Empleado() {
    }

    //CONSTRUCTOR EMPLEADO****************************************************************************************
    
    public Empleado(int NumeroEmpleado, String Usuario, String Contraseña) {
        this.NumeroEmpleado = NumeroEmpleado;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    //GETTERS************************************************************************************************************
    
    public int getNumeroEmpleado() {
        return NumeroEmpleado;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    //SETTERS************************************************************************************************************
    
    public void setNumeroEmpleado(int NumeroEmpleado) {
        this.NumeroEmpleado = NumeroEmpleado;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    //TO STRING*********************************************************************************************************
    
    @Override
    public String toString() {
        return "Empleado{" + "NumeroEmpleado=" + NumeroEmpleado + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + '}';
    }
    
}


