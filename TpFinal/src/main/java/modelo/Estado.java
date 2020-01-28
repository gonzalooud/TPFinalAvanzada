package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Estado implements Serializable{
    
private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int id;
    
    @Column
    private String descripcion;

    //CONTRUCTOR VACIO*********************************************************************************************
    
    public Estado() {
    }

    //CONTRUCTOR ESTADO********************************************************************************************
    
    public Estado(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    //GETTERS Y SETTERS**************************************************************************************************
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //TO STRING*********************************************************************************************************
    
    @Override
    public String toString() {
        return "Estado{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
}
