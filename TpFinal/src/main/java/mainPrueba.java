
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import modelo.Empleado;
import modelo.Historial;
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
        
        emf=Persistence.createEntityManagerFactory("Persistence");
        manager=emf.createEntityManager();
        
          
        Query query=manager.createQuery("FROM Historial");
        List<Historial> list=query.getResultList();
        List<Integer> ultimos=new ArrayList<>();
        list.forEach((e) -> {
            ultimos.add(Integer.parseInt(e.getEmpleadosAsignados().get(e.getEmpleadosAsignados().size()-1).substring(2, 10 )));
            System.out.println("ultima entrada en empleados asignados :"+e.getEmpleadosAsignados().get(e.getEmpleadosAsignados().size()-1));
        });
            System.out.println(ultimos);

            /*   Query query = session.createQuery("SELECT * FROM sistemareclamo.empleado;");
        List<Empleado> listaEmpleados = query.list();
        for (Empleado e : listaEmpleados) {
        System.out.println(e.toString());
        }*/ //TipoReclamo tr = new TipoReclamo ("master en todo");
        /* manager.getTransaction().begin();
        manager.persist(tr);
        manager.getTransaction().commit();*/
        
        
        
    }
    
    private static void imprimirTodo(){
        
        
        
    }




    
    
    
}
