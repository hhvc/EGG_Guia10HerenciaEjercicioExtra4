package servicios;

import entidades.Empleado;
import entidades.Estudiante;
import entidades.Persona;
import enums.EstadoCivil;
import java.util.ArrayList;
import java.util.Scanner;
//
public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void menu(ArrayList<Persona> personas){
        
        boolean salir = false;
        
        do {
            System.out.println("************************************");
            System.out.println("*         MENU PERSONAS            *");
            System.out.println("************************************");
            System.out.println("*   PRESIONE LA OPCIÓN CORRECTA    *");
            System.out.println("*                                  *");
            System.out.println("* 1: Actualizar estado civil       *");
            System.out.println("* 2: Empleado: Reasignar despacho  *");
            System.out.println("* 3: Estudiante: nueva matrícula   *");
            System.out.println("* 4: Profesor: Cambio de depto     *");
            System.out.println("* 5: Personal Servicio: traslado   *");
            System.out.println("* 6: Imprimir lista de personas    *");
            System.out.println("* 7: Salir                         *");
            System.out.println("************************************");           
            
            switch (leer.nextInt()) {
                case 1:
                    System.out.println("Por favor, ingrese el número de ID de la persona a actualizar estado civil o s para salir");
                    String aux = leer.next();
                    boolean aux2 = false;
                    
                    if ("s".equals(aux)) break;
                    
                    for (Persona persona : personas) {
                        
                        if (persona.getId().equalsIgnoreCase(aux)) {
                            System.out.println("Ingrese el nuevo estado civil de "+persona.getNombre()+" Las opciones son: \n casado, viudo ó divorciado");
                            persona.setEstadoCivil(EstadoCivil.valueOf(leer.next()));
                            aux2 = true;
                        }
                    }
                    if (aux2) {
                        System.out.println("Cambios guardados con éxito ");
                    } else System.out.println("No existe una persona con ese número de ID");
                    break;
                    
                case 2:
                    System.out.println("Por favor, ingrese el número de ID de la persona a actualizar estado civil o s para salir");
                    String aux3 = leer.next();
                    boolean aux4 = false;
                    
                    for (Persona persona : personas) {
                        
                        if (persona.getId().equalsIgnoreCase(aux3)) {
                            aux4 = true;
                            if(persona instanceof Empleado){
                                System.out.println("Ingrese el número del nuevo despacho asignado");
                                ((Empleado) persona).setNroDespacho(leer.next());
                            }else   System.out.println("La persona ingresada no es un empleado");
                        }

                    }
                    if (!aux4) {
                        System.out.println("Con el ID ingresado no tenemos una persona registrada");
                    }
                    break;

                case 3:
                    
                    System.out.println("Por favor, ingrese el número de ID del estudiante a matricular");
                    String aux5 = leer.next();
                    boolean aux6 = false;
                    ArrayList arrayAux = new ArrayList();
                    
                    for (Persona persona : personas) {
                        
                        if (persona.getId().equalsIgnoreCase(aux5)) {
                            aux4 = true;
                            if(persona instanceof Estudiante){
                                
                                arrayAux=((Estudiante) persona).getCursos();
                                System.out.println("Ingrese el nombre de la materia a la que se quiere matricular");
                                arrayAux.add(leer.next());
                                ((Estudiante) persona).setCursos(arrayAux);
                            }else   System.out.println("La persona ingresada no es un estudiante");
                        }

                    }
                    if (!aux6) {
                        System.out.println("Con el ID ingresado no tenemos una persona registrada");
                    }
                    break;
                    
                case 4:
                    break;
                
                    
                case 5:
                    break;
                    
                case 6:
                    salir = true;
                    System.out.println("Hasta luego");
                    break;
                    
                    
                default:
                    System.out.println("Ingresó una opción incorrecta. Pruebe de nuevo");
                    throw new AssertionError();
            }
                    
        } while (salir);
        
        

        
        
        


//• Traslado de sección de un empleado del personal de servicio.
//• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
//que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
        
        
        
    }
    
}
