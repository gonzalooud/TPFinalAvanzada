package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="CONTRATO")
public class Contrato implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idReclamo;
    
    @Column
    @OneToOne
    private Cliente cliente;
    
    @Column
    @ManyToMany
    private ArrayList<Servicio> servicio;
    
    @Column
    private float ValorPrecio;
    
    //CONSTRUCTOR VACIO********************************************************************************************

    public Contrato() {
    }
    
    //CONSTRUCTOR CONTRATO****************************************************************************************

    public Contrato(Cliente cliente, ArrayList<Servicio> servicio, float ValorPrecio) {
        this.cliente = cliente;
        this.servicio = servicio;
        this.ValorPrecio = ValorPrecio;
    }

    //GETTERS************************************************************************************************************

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Servicio> getServicio() {
        return servicio;
    }

    public float getValorPrecio() {
        return ValorPrecio;
    }
    
    //SETTERS************************************************************************************************************

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServicio(ArrayList<Servicio> servicio) {
        this.servicio = servicio;
    }

    public void setValorPrecio(float ValorPrecio) {
        this.ValorPrecio = ValorPrecio;
    }
    
    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Contrato{" + "cliente=" + cliente + ", servicio=" + servicio + ", ValorPrecio=" + ValorPrecio + '}';
    }
    
}
