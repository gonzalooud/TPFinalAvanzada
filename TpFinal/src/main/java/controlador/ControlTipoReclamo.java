package controlador;

import controladorJPA.TipoReclamoJpaController;

public class ControlTipoReclamo {
    
    private ControlSistema controlSistema;
    private TipoReclamoJpaController jpaControl = new TipoReclamoJpaController();
    private String mensaje="";
    
    public ControlTipoReclamo(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
}
