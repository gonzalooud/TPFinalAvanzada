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
    
}
