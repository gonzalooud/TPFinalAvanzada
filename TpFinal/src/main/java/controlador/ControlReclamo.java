package controlador;

import controladorJPA.ReclamoJpaController;

public class ControlReclamo {
    
    private ControlSistema controlSistema;
    private ReclamoJpaController jpaControl = new ReclamoJpaController();
    private String mensaje="";
    
    public ControlReclamo(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
}
