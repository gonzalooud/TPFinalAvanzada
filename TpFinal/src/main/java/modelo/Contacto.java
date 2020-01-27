package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table (name = "CONTACTO")
public class Contacto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Column
    private ArrayList <String> correo;
   
    @Column
    private ArrayList <Integer> telefonoFijo;
    
    @Column
    private ArrayList <Integer> telefonoMovil;
    
    @Column
    private String calle;
    
    @Column
    private int numeracion;
    
    @Column
    private int piso;
    
    @Column
    private String departamento;
    
    @Column
    private String nombreCiudad;
    
    @Column
    private String nombreProvincia;

    //CONSTRUCTOR VACIO********************************************************************************************
    
    public Contacto() {
    }
    
    //CONSTRUCTOR CONTACTO
    
    
}
