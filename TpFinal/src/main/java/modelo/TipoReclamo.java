package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TipoReclamo implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int idTipo;
    
    @Column
    private String descripcion;

    //CONSTRUCTOR TIPO RECLAMO************************************************************************************
    
    public TipoReclamo(int idTipo, String descripcion) {
        this.idTipo = idTipo;
        this.descripcion = descripcion;
    }

    //GETTERS Y SETTERS**************************************************************************************************
    
    public int getIdTipo() {
        return idTipo;
    }

    public void setId(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //CONSTRUCTOR VACIO********************************************************************************************
    
    public TipoReclamo() {
    }
    
    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "TipoReclamo{" + "idTipo=" + idTipo + ", descripcion=" + descripcion + '}';
    }
    
}
