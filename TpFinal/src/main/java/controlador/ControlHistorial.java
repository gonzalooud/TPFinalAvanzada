package controlador;

import controladorJPA.HistorialJpaController;

public class ControlHistorial {
    
    private ControlSistema controlSistema;
    private HistorialJpaController jpaControl = new HistorialJpaController();
    private String mensaje="";
    
    public ControlHistorial(ControlSistema controlSistema){
        this.controlSistema = controlSistema;
    }
}
