package controlador;

import controladorJPA.ClienteJpaController;
import modelo.Cliente;
import java.util.List;
import java.util.ArrayList;

public class ControlCliente {
    
    private ControlSistema controlSistema;
    private ClienteJpaController jpaControl = new ClienteJpaController();
    private String mensaje="";
    
    public ControlCliente(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    //Recuperar instancia de Cliente***********************************************************************************
    
    public Cliente getCliente(int dni){
        Cliente clienteBuscado = null;
        List<Cliente> listaClientes = new ArrayList<>(falta el llamado a la funcion);
        for(Cliente c: listaClientes){
            if(c.getDni()== dni){
                clienteBuscado = c;
            }
        }
        return clienteBuscado;
    }
     /*  - - - - - Manejo de JPA - - - - -   */
    public String insertarCliente(Cliente cliente) {
		try {
			jpaControl.create(cliente);
			mensaje = "Cliente agregado correctamente.";
		}
		catch (Exception e) {
			System.out.println("Mensaje en guardar: " + e.getMessage());
			mensaje = "Error al almacenar el Cliente.";
		}
		return mensaje;
    }
    
    public String actualizarCliente(Cliente cliente) {
        try {
			jpaControl.edit(cliente);
			mensaje = "Cliente actualizado correctamente.";
		}
		catch (Exception e) {
			System.out.println("Mensaje en actualizar: " + e.getMessage());
			mensaje = "Error al actualizar el Cliente.";
		}
        System.out.println(mensaje);
		return mensaje;
    }
    
    public String eliminarCliente(Cliente cliente) {
    	try
        {
            jpaControl.destroy(cliente.getId());
            mensaje = "Cliente eliminado correctamente";
        }
        catch (Exception e) {
            System.out.println("Mensaje en eliminar: " + e.getMessage());
            mensaje = "Error al eliminar el Cliente";
        }
        return mensaje;
    }
}
