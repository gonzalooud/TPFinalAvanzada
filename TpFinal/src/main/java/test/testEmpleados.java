/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Empleado;


/**
 *
 * @author xx-gi
 */
public class testEmpleados {
    
    private static EntityManagerFactory emf;
    
    private static EntityManager manager; 
    
    public static void main(String[] args){
        
        emf =Persistence.createEntityManagerFactory("aplicacion");
        manager = emf.createEntityManager();
        
        List<Empleado> empleados =(List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
        System.out.println("Hay:"+ empleados.size());
    }
    
}
