package controlador;

import controladorJPA.EmpleadoJpaController;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleado;
import modelo.Historial;


public class ControlEmpleado {
    
    private ControlSistema controlSistema;
    private String mensaje  = "";
    private EmpleadoJpaController jpaControl = new EmpleadoJpaController();
   
    
    public ControlEmpleado(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    public String asignarEmpleado(String urgencia){
        List<Historial> list=controlSistema.getmSistema().getHistoriales();
        int aux1=0 ,aux2 = 0, cont1=0 , cont2=0 ;
        if(urgencia.equalsIgnoreCase("urgente")){
         List<Integer> ultimos=new ArrayList<>();
         list.forEach((e) -> {
            ultimos.add(Integer.parseInt(e.getEmpleadosAsignados().get(e.getEmpleadosAsignados().size()-1).substring(2, 10 )));
        });
         for(int e:ultimos){
                if(cont1 == 0){
                    aux1 = e;
                }else if(cont2 == 0){
                    aux2=e;
                    }else if(cont1 <= cont2){
                        aux2=e;
                        cont2=0;
                        }else{
                        aux1=aux2;
                        cont1=cont2;
                        aux2=e;
                        cont2=0; 
                        }
                for(int a:ultimos){
                    if(aux2 == 0){
                        if(aux1 == a){
                            cont1++;
                        }
                    }else{
                        if(aux2 == a){
                            cont2++;
                        }
                    }
                }
        }
        }else{
            List<String> todos=new ArrayList<>();
            List<Integer> todosInt=new ArrayList<>();
            list.forEach((e) -> {
                todos.addAll(e.getEmpleadosAsignados());
            });
            todos.forEach((a)  ->{
                todosInt.add(Integer.parseInt(a.substring(2, 10)));
            });
            for(int e:todosInt){
                if(cont1 == 0){
                    aux1 = e;
                }else if(cont2 == 0){
                    aux2=e;
                    }else if(cont1 >= cont2){
                        aux2=e;
                        cont2=0;
                        }else{
                        aux1=aux2;
                        cont1=cont2;
                        aux2=e;
                        cont2=0; 
                        }
                for(int a:todosInt){
                    if(aux2 == 0){
                        if(aux1 == a){
                            cont1++;
                        }
                    }else{
                        if(aux2 == a){
                            cont2++;
                        }
                    }
                }
            }
        }
        
        String empleadoAsignar ="1-"+aux1;
        return empleadoAsignar;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //MANEJO DE JPA***************************************************************************************************
    
    public String insertarEmpleado(Empleado empleado) {
        try {
            jpaControl.create(empleado);
            mensaje = "Reclamo agregado correctamente.";
        }
        catch (Exception e) {
            System.out.println("Mensaje en guardar: " + e.getMessage());
            mensaje = "Error al almacenar el reclamo.";
        }
        return mensaje;
    }
    
    public String actualizarEmpleado(Empleado empleado) {
        try {
            jpaControl.edit(empleado);
            mensaje = "Reclamo actualizado correctamente.";
        }
        catch (Exception e) {
            System.out.println("Mensaje en actualizar: " + e.getMessage());
            mensaje = "Error al actualizar el reclamo.";
        }
        return mensaje;
    }
    
    public String eliminarEmpleado(Empleado empleado) {
        try {
            jpaControl.destroy(empleado.getDni());
            mensaje = "Reclamo eliminado correctamente";
        }
        catch (Exception e) {
            System.out.println("Mensaje en eliminar: " + e.getMessage());
            mensaje = "Error al eliminar el reclamo";
        }
        return mensaje;
    }
    
}
