
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.TipoReclamo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xx-gi
 */
public class mainPrueba {
    
    private static EntityManager manager;
    
    private static EntityManagerFactory emf;
    
    
    
    public static void main(String[]args) {
        
        emf=Persistence.createEntityManagerFactory("aplicacion");
        manager=emf.createEntityManager();
        
        TipoReclamo tr = new TipoReclamo (100,"master en todo");
        
        manager.getTransaction().begin();
        manager.persist(tr);
        manager.getTransaction().commit();
        
        
        
    }
    
    private static void imprimirTodo(){
        
        
        
    }
    
    
}
