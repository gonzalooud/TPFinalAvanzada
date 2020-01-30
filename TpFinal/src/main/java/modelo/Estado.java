package modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name = "ESTADO")
public class Estado implements Serializable{
    
private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idEstado;
    
    @Column
    private String descripcion;

    //CONTRUCTOR VACIO*********************************************************************************************
    
    public Estado() {
    }

    //CONTRUCTOR ESTADO********************************************************************************************
    
    public Estado(String descripcion) {
        this.descripcion = descripcion;
    }

    //GETTERS Y SETTERS**************************************************************************************************
    
    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstaod(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
