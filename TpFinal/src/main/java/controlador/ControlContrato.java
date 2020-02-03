package controlador;

import exception.Notificaciones;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ControlContrato {
    
    private ControlSistema controlSistema;
    
    public ControlContrato(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    
    /* Recuperar lista de tipos de servicio contratados por un cliente, como lista de String */
    public List<String> listarServicio(int dniCliente) throws Notificaciones{
        List<String> listaServicios = new ArrayList();
        String mensaje = null;
        Cliente cliente = null;
        cliente = controlSistema.getControlCliente().getCliente(dniCliente);
        if(cliente != null){
            for(TipoServicio ts: cliente.getContrato().getTiposServicio()){
                listaTiposServ.add(ts.getTipoServ());
            }
        }
        else{
            mensaje = "No se ha encontrado al cliente.";
            throw new Notificaciones(mensaje);
        }
        
        if(listaTiposServ.isEmpty()){
                mensaje = "El cliente no posee servicios contratados.";
                throw new Notificaciones(mensaje);
        }
        
        return listaTiposServ;
    }
    
}
