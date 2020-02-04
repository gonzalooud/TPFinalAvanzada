package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.*;

public class ControlSistema {
    
    /*Instancias de modelo y vista del sistema*/
    private Sistema mSistema;
    //private vistaSistema vSistema;
    
    /*Instancias de controladores del sistema*/
    private ControlCliente controlCliente;
    private ControlContrato controlContrato;
    private ControlContacto controlContacto;
    private ControlEmpleado controlEmpleado;
    private ControlEstado controlEstado;
    private ControlHistorial controlHistorial;
    private ControlReclamo controlReclamo;
    private ControlServicio controlServicio;
    private ControlTipoReclamo controlTipoReclamo;
    
    
    /*Constructor*/
    public ControlSistema(Sistema mSistema) {
        this.mSistema = mSistema;
        this.controlCliente = new ControlCliente(this);
        this.controlContrato = new ControlContrato(this);
        this.controlContacto = new ControlContacto(this);
        this.controlEmpleado = new ControlEmpleado(this);
        this.controlEstado = new ControlEstado(this);
        this.controlHistorial = new ControlHistorial(this);
        this.controlReclamo = new ControlReclamo(this);
        this.controlServicio = new ControlServicio(this);
        this.controlTipoReclamo = new ControlTipoReclamo(this);

        this.cargarDatosDesdeBD();
    }

//    public String getDatosInicialesReclamo (int dniCliente){
//        
//        
//        return "";
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    public Sistema getmSistema() {
        return mSistema;
    }

    public void setmSistema(Sistema mSistema) {
        this.mSistema = mSistema;
    }

    public ControlCliente getControlCliente() {
        return controlCliente;
    }

    public void setControlCliente(ControlCliente controlCliente) {
        this.controlCliente = controlCliente;
    }

    public ControlContrato getControlContrato() {
        return controlContrato;
    }

    public void setControlContrato(ControlContrato controlContrato) {
        this.controlContrato = controlContrato;
    }

    public ControlContacto getControlContacto() {
        return controlContacto;
    }

    public void setControlContacto(ControlContacto controlContacto) {
        this.controlContacto = controlContacto;
    }

    public ControlEmpleado getControlEmpleado() {
        return controlEmpleado;
    }

    public void setControlEmpleado(ControlEmpleado controlEmpleado) {
        this.controlEmpleado = controlEmpleado;
    }

    public ControlEstado getControlEstado() {
        return controlEstado;
    }

    public void setControlEstado(ControlEstado controlEstado) {
        this.controlEstado = controlEstado;
    }

    public ControlHistorial getControlHistorial() {
        return controlHistorial;
    }

    public void setControlHistorial(ControlHistorial controlHistorial) {
        this.controlHistorial = controlHistorial;
    }

    public ControlReclamo getControlReclamo() {
        return controlReclamo;
    }

    public void setControlReclamo(ControlReclamo controlReclamo) {
        this.controlReclamo = controlReclamo;
    }

    public ControlServicio getControlServicio() {
        return controlServicio;
    }

    public void setControlServicio(ControlServicio controlServicio) {
        this.controlServicio = controlServicio;
    }

    public ControlTipoReclamo getControlTipoReclamo() {
        return controlTipoReclamo;
    }

    public void setControlTipoReclamo(ControlTipoReclamo controlTipoReclamo) {
        this.controlTipoReclamo = controlTipoReclamo;
    }
   
    
    
    private void cargarDatosDesdeBD() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");
    	EntityManager manager = emf.createEntityManager();
        
        this.mSistema.setClientes((List<Cliente>)manager.createQuery("FROM Cliente").getResultList());
        this.mSistema.setContratos((List<Contrato>)manager.createQuery("FROM Contrato").getResultList());
        this.mSistema.setContactos((List<Contacto>)manager.createQuery("FROM Contacto").getResultList());
        this.mSistema.setEmpleados((List<Empleado>)manager.createQuery("FROM Empleado").getResultList());
        this.mSistema.setEstados((List<Estado>)manager.createQuery("FROM Estados").getResultList());
        this.mSistema.setHistoriales((List<Historial>)manager.createQuery("FROM Historial").getResultList());
        this.mSistema.setReclamos((List<Reclamo>)manager.createQuery("FROM Reclamo").getResultList());
        this.mSistema.setServicios((List<Servicio>)manager.createQuery("FROM Servicios").getResultList());
        this.mSistema.setTiposReclamos((List<TipoReclamo>)manager.createQuery("FROM TipoReclamo").getResultList());
    }
    
}
