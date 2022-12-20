package entidades;

import enums.EstadoCivil;
import java.util.ArrayList;

public class Estudiante extends Persona{
    private ArrayList<String> cursos;

    public Estudiante() {
    }

    public Estudiante(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public Estudiante(ArrayList<String> cursos, String nombre, String apellido, String id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.cursos = cursos;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cursos=" + cursos + '}';
    }
    
    
    
    
}
