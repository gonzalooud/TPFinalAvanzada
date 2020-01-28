/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.HashMap;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author xx-gi
 */
public class Historial implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    
    @Column
    private HashMap< Integer , Integer > empleadosAsignados;
    
    @Column
    private String descripcion;
    
    @Column
    @ManyToMany
    private Estado estado;

    public Historial() {
    }

    public Historial(int id, HashMap<Integer, Integer> empleadosAsignados, String descripcion, Estado estado) {
        this.id = id;
        this.empleadosAsignados = empleadosAsignados;
        this.descripcion = descripcion;
        this.estado = estado;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, Integer> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void setEmpleadosAsignados(HashMap<Integer, Integer> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Historial{" + "id=" + id + ", empleadosAsignados=" + empleadosAsignados + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }


   

    
    
    
}
