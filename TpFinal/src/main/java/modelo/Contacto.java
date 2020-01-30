package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "CONTACTO")
public class Contacto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int idContacto;
    
    @Column
    private List <String> correo=new ArrayList<>();
   
    @Column
    private List <Integer> telefonoFijo=new ArrayList<>();
    
    @Column
    private List <Integer> telefonoMovil=new ArrayList<>();
    
    @Column
    private String calle;
    
    @Column
    private int numeracion;
    
    @Column
    private int piso;
    
    @Column
    private String departamento;
    
    @Column
    private String nombreCiudad;
    
    @Column
    private String nombreProvincia;

    //CONSTRUCTOR VACIO********************************************************************************************
    
    public Contacto() {
    }
    
    //CONSTRUCTOR CONTACTO***************************************************************************************

    public Contacto(List<String> correo, List<Integer> telefonoFijo, List<Integer> telefonoMovil, String calle, int numeracion, int piso, String departamento, String nombreCiudad, String nombreProvincia) {
        this.correo = correo;
        this.telefonoFijo = telefonoFijo;
        this.telefonoMovil = telefonoMovil;
        this.calle = calle;
        this.numeracion = numeracion;
        this.piso = piso;
        this.departamento = departamento;
        this.nombreCiudad = nombreCiudad;
        this.nombreProvincia = nombreProvincia;
    }
    
    //GETTERS***********************************************************************************************************

    public int getIdContacto() {
        return idContacto;
    }
    
    public List<String> getCorreo() {
        return correo;
    }

    public List<Integer> getTelefonoFijo() {
        return telefonoFijo;
    }

    public List<Integer> getTelefonoMovil() {
        return telefonoMovil;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public int getPiso() {
        return piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }
    
   //SETTERS*************************************************************************************************************

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public void setCorreo(List<String> correo) {
        this.correo = correo;
    }

    public void setTelefonoFijo(List<Integer> telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public void setTelefonoMovil(List<Integer> telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
    
    //TO STRING*********************************************************************************************************

    @Override
    public String toString() {
        return "Contacto{" + "correo=" + correo + ", telefonoFijo=" + telefonoFijo + ", telefonoMovil=" + telefonoMovil + ", calle=" + calle + ", numeracion=" + numeracion + ", piso=" + piso + ", departamento=" + departamento + ", nombreCiudad=" + nombreCiudad + ", nombreProvincia=" + nombreProvincia + '}';
    }
    
}
