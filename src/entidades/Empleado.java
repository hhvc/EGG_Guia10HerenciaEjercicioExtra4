package entidades;

import enums.EstadoCivil;
import java.util.Date;

public abstract class Empleado extends Persona{
    // año de incorporación a la facultad y qué número de despacho tienen asignado.
    protected Date anioIngreso;
    protected String nroDespacho;

    public Empleado(Date anioIngreso, String nroDespacho, String nombre, String apellido, String id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.nroDespacho = nroDespacho;
    }

    public Date getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(Date anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(String nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    @Override
    public String toString() {
        return "Empleado{" + "anioIngreso=" + anioIngreso + ", nroDespacho=" + nroDespacho + '}';
    }

 
    
    
}
