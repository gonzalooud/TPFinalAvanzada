package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int dni;
    
    @Column
    private String nombre;
    
    @Column
    private SimpleDateFormat fechaNacimiento;
    
    @Column
    private Contacto contacto;
    
    //CONSTRUCTOR VACIO********************************************************************************************

    public Persona() {
    }
    
    //CONSTRUCTOR PERSONA

    public Persona(int dni, String nombre, SimpleDateFormat fechaNacimiento, Contacto contacto) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.contacto = contacto;
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

    public Contacto getContacto() {
        return contacto;
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

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }
    
    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", contacto=" + contacto + '}';
    }

}

