package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "CLIENTE")
public class Cliente implements Serializable {
    
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
    
    @OneToOne
    @JoinColumn
    private Contrato contrato;
    
    @Column
    private int numeroCliente;

    //CONTRUCTOR VACIO*********************************************************************************************
    
    public Cliente() {
    }

    //CONSTRUCTOR CLIENTE*******************************************************************************************

    public Cliente(int dni, String nombre, SimpleDateFormat fechaNacimiento, int numeroCliente) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCliente = numeroCliente;
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

    public Contrato getContrato() {
        return contrato;
    }

    public int getNumeroCliente() {
        return numeroCliente;
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
    
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", contacto=" + contacto + ", contrato=" + contrato + ", numeroCliente=" + numeroCliente + '}';
    }
    
}




