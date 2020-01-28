package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ESPECIALIDAD")
public class Especialidad implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idEspecialidad;
    
    @Column
    private String especialidadServicio;
    
    @Column
    private ArrayList <TipoReclamo> tipoReclamo;
    
    //CONTRUCTOR VACIO*********************************************************************************************

    public Especialidad() {
    }
    
    //CONSTRUCTOR ESPECIALIDAD************************************************************************************

    public Especialidad(String especialidadServicio, ArrayList<TipoReclamo> tipoReclamo) {
        this.especialidadServicio = especialidadServicio;
        this.tipoReclamo = tipoReclamo;
    }
    
    //GETTERS************************************************************************************************************

    public String getEspecialidadServicio() {
        return especialidadServicio;
    }

    public ArrayList<TipoReclamo> getTipoReclamo() {
        return tipoReclamo;
    }
    
    //SETTERS************************************************************************************************************

    public void setEspecialidadServicio(String especialidadServicio) {
        this.especialidadServicio = especialidadServicio;
    }

    public void setTipoReclamo(ArrayList<TipoReclamo> tipoReclamo) {
        this.tipoReclamo = tipoReclamo;
    }
    
    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Especialidad{" + "especialidadServicio=" + especialidadServicio + ", tipoReclamo=" + tipoReclamo + '}';
    }
    
    
}
