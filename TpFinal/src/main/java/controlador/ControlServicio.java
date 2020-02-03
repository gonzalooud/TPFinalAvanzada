package controlador;

import controladorJPA.ServicioJpaController;

public class ControlServicio {
    
    private ControlSistema controlSistema;
    private ServicioJpaController jpaControl = new ServicioJpaController();
    private String mensaje="";
    
    public ControlServicio(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
}
