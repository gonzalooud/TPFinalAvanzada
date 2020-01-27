package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table (name = "PERSONA")
@Inheritance(strategy=InheritanceType.JOINED)
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column
    private int dni;
    
    @Column
    private String nombre;
    
    @Column
    private SimpleDateFormat fechaNacimiento;
    
    //CONSTRUCTOR VACIO********************************************************************************************

    public Persona() {
    }
    
    //CONSTRUCTOR PERSONA

    public Persona(int dni, String nombre, SimpleDateFormat fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //GETTERS***********************************************************************************************************

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public SimpleDateFormat getFechaNacimiento() {
        return fechaNacimiento;
    }
 
    //SETTERS************************************************************************************************************

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(SimpleDateFormat fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
}

