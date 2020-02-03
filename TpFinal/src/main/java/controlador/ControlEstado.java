package controlador;

import controladorJPA.EstadoJpaController;

public class ControlEstado {
    
    private ControlSistema controlSistema;
    private EstadoJpaController jpaControl = new EstadoJpaController();
    private String mensaje="";
    
    public ControlEstado(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
}
