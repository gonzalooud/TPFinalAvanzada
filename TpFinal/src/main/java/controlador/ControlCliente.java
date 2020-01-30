/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controladorJPA.ClienteJpaController;
import modelo.Cliente;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author gonza
 */
public class ControlCliente {
    
    private ControlSistema controlSistema;
    private ClienteJpaController jpac = new ClienteJpaController();
    private String mensaje="";
    
    public ControlCliente(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
    
    /* Recuperar instancia de Cliente */
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
