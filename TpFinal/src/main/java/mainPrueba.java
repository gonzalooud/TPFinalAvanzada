
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Empleado;
import modelo.TipoReclamo;
import org.hibernate.Session;
import org.hibernate.query.Query;

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
    
    private static Session session;
    

    
    public static void main(String[]args) {
        
        emf=Persistence.createEntityManagerFactory("aplicacion");
        manager=emf.createEntityManager();
        
        
        
         /*   Query query = session.createQuery("SELECT * FROM sistemareclamo.empleado;");
            List<Empleado> listaEmpleados = query.list();
            for (Empleado e : listaEmpleados) {
            System.out.println(e.toString());
            }*/
        
        //TipoReclamo tr = new TipoReclamo ("master en todo");
        
       /* manager.getTransaction().begin();
        manager.persist(tr);
        manager.getTransaction().commit();*/
        
        
        
    }
    
    private static void imprimirTodo(){
        
        
        
    }




    
    
    
}
