package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "CLIENTE")
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column
    private Contrato contrato;
    
    @Column
    private int numeroCliente;

    //CONTRUCTOR VACIO*********************************************************************************************
    
    public Cliente() {
    }

    //CONSTRUCTOR CLIENTE*******************************************************************************************
    
    public Cliente(Contrato contrato, int numeroCliente) {
        this.contrato = contrato;
        this.numeroCliente = numeroCliente;
    }

    //GETTERS***********************************************************************************************************
    
    public Contrato getContrato() {
        return contrato;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    //SETTERS************************************************************************************************************
    
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    //TO STRING*********************************************************************************************************
    
    @Override
    public String toString() {
        return "Cliente{" + "contrato=" + contrato + ", numeroCliente=" + numeroCliente + '}';
    }
    
    
}




