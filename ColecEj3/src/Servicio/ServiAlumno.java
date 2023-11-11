/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 * @author crist
 */
public class ServiAlumno {
    private Scanner leer;
    

    public ServiAlumno() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public ArrayList<Alumno> crearAlum(){
        ArrayList<Alumno>alumnos = new ArrayList();
        String opc;
        do {
            Alumno alum = new Alumno();
        ArrayList<Integer>notas = new ArrayList();
        System.out.println("Ingrese el nombre del Alumno");
        alum.setNom(leer.next());
        System.out.println("Ingrese las Notas del Alumno");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota N°: "+i);
            notas.add(leer.nextInt());
        }
        alumnos.add(alum);
            System.out.println("Desea Agregar a otro Alumno?(S = si/ N = no)");
            opc = leer.next();
        } while (opc.equalsIgnoreCase("s"));
        return alumnos;
    }
    
    public void mostrarNotaFinal(ArrayList<Alumno> r1){
        System.out.println("Ingrese el nombre del Alumno q desea Calcular");
        String al = leer.next();
        int no = 0;
        double fin;
        
        for (Alumno alumno : r1) {
            if (al.equalsIgnoreCase(alumno.getNom())) {
                for (int i = 0; i < alumno.getNotas().size(); i++) {
                    no = 
                }
                
                System.out.println("El Promedio del Alumno "+al+" es:");
                System.out.println("");
            }
        }
   
}
        
        
    
}

    

