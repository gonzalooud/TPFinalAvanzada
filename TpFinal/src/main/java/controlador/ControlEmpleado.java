package controlador;

import controladorJPA.EmpleadoJpaController;
import modelo.Empleado;


public class ControlEmpleado {
    
    private String mensaje  = "";
    private EmpleadoJpaController jpaControl = new EmpleadoJpaController();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
