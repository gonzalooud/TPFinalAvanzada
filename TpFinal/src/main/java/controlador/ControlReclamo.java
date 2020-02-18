package controlador;

import controladorJPA.ReclamoJpaController;
import exception.Notificaciones;
import modelo.Reclamo;
import modelo.Cliente;
import modelo.Servicio;
import modelo.TipoReclamo;
import modelo.Historial;
import modelo.Empleado;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import modelo.Estado;

public class ControlReclamo {
    
    private ControlSistema controlSistema;
    private ReclamoJpaController jpaControl = new ReclamoJpaController();
    private String mensaje="";
    
    public ControlReclamo(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    public String nuevoReclamo(Cliente cliente, Servicio servicio, String descripcion,
            String urgencia, Empleado empleadoRegistro, Historial historial, TipoReclamo tipoReclamo)throws Notificaciones{
        Reclamo nuevoReclamo = null;
        Timestamp fecha = new Timestamp(System.currentTimeMillis());
        nuevoReclamo = new Reclamo(cliente, servicio, descripcion, urgencia, fecha, empleadoRegistro, historial, tipoReclamo);
        if(nuevoReclamo==null){
            throw new Notificaciones("Error en la creacion del nuevo reclamo, por favor intente denuevo.");
        }
        insertarReclamo(nuevoReclamo);
        this.controlSistema.getmSistema().getReclamos().add(nuevoReclamo);
        this.mensaje= "El reclamo ha sido generado exitosamente. El codigo es: " + Integer.toString(nuevoReclamo.getIdReclamo()) + ".";
        return mensaje;
    }
    
    
        public boolean existeReclamo(int idReclamo){
        boolean existe=false;
        List<Reclamo> listaReclamos = new ArrayList<>(controlSistema.getmSistema().getReclamos());
        for(Reclamo r: listaReclamos){
            if(idReclamo==r.getIdReclamo()){
                existe=true;
            }
        }
        return existe;
    }
    
    
     /*  - - - - - Manejo de JPA - - - - -   */
    public String insertarReclamo(Reclamo reclamo) {
		try {
			jpaControl.create(reclamo);
			mensaje = "Reclamo agregado correctamente.";
		}
		catch (Exception e) {
			System.out.println("Mensaje en guardar: " + e.getMessage());
			mensaje = "Error al almacenar el Reclamo.";
		}
		return mensaje;
    }
    
    public String actualizarReclamo(Reclamo reclamo) {
        try {
			jpaControl.edit(reclamo);
			mensaje = "Reclamo actualizado correctamente.";
		}
		catch (Exception e) {
			System.out.println("Mensaje en actualizar: " + e.getMessage());
			mensaje = "Error al actualizar el Reclamo.";
		}
		return mensaje;
    }
    
    public String eliminarReclamo(Reclamo reclamo) {
    	try
        {
            jpaControl.destroy(reclamo.getIdReclamo());
            mensaje = "Reclamo eliminado correctamente";
        }
        catch (Exception e) {
            System.out.println("Mensaje en eliminar: " + e.getMessage());
            mensaje = "Error al eliminar el Reclamo.";
        }
        return mensaje;
    }
    
}
