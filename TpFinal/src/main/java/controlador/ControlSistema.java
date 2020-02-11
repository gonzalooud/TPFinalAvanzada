package controlador;

import exception.Notificaciones;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import modelo.*;
import vista.Principal;

public class ControlSistema {
    
    /*Instancias de modelo y vista del sistema*/
    private Sistema mSistema;
    private Principal vPrincipal;
    
    
    /*Instancia de la sesion del empleado loggeado*/
    private Empleado sesion = null;
    
    /*Instancias de controladores del sistema*/
    private ControlCliente controlCliente;
    private ControlContrato controlContrato;
    private ControlContacto controlContacto;
    private ControlEmpleado controlEmpleado;
    private ControlEstado controlEstado;
    private ControlHistorial controlHistorial;
    private ControlLogin controlLogin;
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
        this.controlLogin = new ControlLogin(this);
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
    
    public void controlLogin(String usuario, String clave, Principal vistaPrincipal){
        this.vPrincipal = vistaPrincipal;
        
        try {
            this.sesion = this.getControlLogin().getEmpleadoLogin(usuario, clave);
        }catch (Notificaciones ex) {
            //JOptionPane.showMessageDialog(this.vPrincipal, ex.getMessage());
        }
        
        if(sesion != null){
            /* Comprobar el tipo de usuario para mostrar su correspondiente vista */
            if(sesion.getSupervisor()==1){
                //this.vPrincipal.mostrarSupervisor();
            }else{
                //this.vPrincipal.mostrarSupervisor();
            }
        }
    }

    public void agregarReclamo(int dniCliente, String servicio, String descripcion, String urgencia
    , String tipoReclamo, String estado, String descripcionHistorial) throws Notificaciones{
        String mensaje;
        if(servicio.isBlank() || descripcion.isBlank() || urgencia.isBlank() || tipoReclamo.isBlank() || estado.isBlank() || descripcionHistorial.isBlank()){
            throw new Notificaciones("Por favor complete todos los campos.");
        }
        Cliente cliente= this.controlCliente.getCliente(dniCliente);
        if(cliente==null){
            throw new Notificaciones("El dni ingresado no corresponde con un cliente en servicio.");
        }
        Servicio servicioAgregar= this.controlServicio.getServicio(servicio);
        if(servicioAgregar==null){
            throw new Notificaciones("Error en la busqueda, no se encuentra el servicio.");
        }
        TipoReclamo tipoReclamoAgregar= this.controlTipoReclamo.getTipoReclamo(tipoReclamo);
        if(tipoReclamoAgregar==null){
            throw new Notificaciones("Error en la busqueda, no se encuentra el tipo de reclamo.");
        }
        Estado estadoAgregar= this.getControlEstado().getEstado(estado);
        if(estadoAgregar==null){
            throw new Notificaciones("Error en la busqueda, no se encuentra el estado seleccionado.");
        }
        /*generar la asignacion de empleado*/
        String empleadoAsignar="";
        /*---------------------------------*/
        Historial historial= this.controlHistorial.agregarHistorial(empleadoAsignar, descripcion, estadoAgregar);
        mensaje= this.controlReclamo.nuevoReclamo(cliente, servicioAgregar, descripcion, urgencia, sesion, historial, tipoReclamoAgregar);
        JOptionPane.showMessageDialog(this.vPrincipal, mensaje);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public Principal getvPrincipal() {
        return vPrincipal;
    }

    public void setvSistema(Principal vPrincipal) {
        this.vPrincipal = vPrincipal;
    }

    public Empleado getSesion() {
        return sesion;
    }

    public void setSesion(Empleado sesion) {
        this.sesion = sesion;
    }

    public ControlLogin getControlLogin() {
        return controlLogin;
    }

    public void setControlLogin(ControlLogin controlLogin) {
        this.controlLogin = controlLogin;
    }
    
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
