package entidades;

import enums.EstadoCivil;
import java.util.Date;

public class PersonalServicio extends Empleado{

    private String seccion;

    public PersonalServicio(String seccion, Date anioIngreso, String nroDespacho, String nombre, String apellido, String id, EstadoCivil estadoCivil) {
        super(anioIngreso, nroDespacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalServicio{" + "seccion=" + seccion + '}';
    }
    
    
    
}
