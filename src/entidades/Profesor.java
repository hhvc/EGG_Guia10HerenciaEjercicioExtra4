package entidades;

import enums.EstadoCivil;
import java.util.Date;

public class Profesor extends Empleado {
    
    private String departamento;

    
    public Profesor(String departamento, Date anioIngreso, String nroDespacho, String nombre, String apellido, String id, EstadoCivil estadoCivil) {
        super(anioIngreso, nroDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "departamento=" + departamento + '}';
    }
    
    
}
