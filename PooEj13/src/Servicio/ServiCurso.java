/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 * método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 * @author crist
 */
public class ServiCurso {
    private Scanner leer;

    public ServiCurso() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearAlumnos(Curso al){
       
        String[] alum = new String[5];
        System.out.println("Ingrese el nombre de los Alumnos");
        for (int i = 0; i < 5; i++) {
            System.out.println("Primer Alumno");
            alum[i] = leer.next();
        }
        al.setAlumnos(alum);
        
    }
    public Curso crearCurso(){
        Curso c1 = new Curso();
        System.out.println("Ingrese el Nombre del Curso");
        c1.setNombreCurso(leer.next());
        System.out.println("Ingrese la Cantidad de horas por Dia");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de Dias por Semana");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el Turno del Curso");
        c1.setTurno(leer.next());
        System.out.println("Ingrese el Precio por Hora");
        c1.setPrecioPorHora(leer.nextInt());
        crearAlumnos(c1);
        return c1;
        
    }
    /**
     *  Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
     * @param c1 
     */
    public void calcularGananciaSemanal(Curso c1){
        System.out.println("La ganancia semanal del curso "+" "+c1.getNombreCurso()+":");
        int ganancia;
        ganancia = c1.getCantidadHorasPorDia() * c1.getPrecioPorHora();
        ganancia = ganancia * c1.getAlumnos().length;
        ganancia = ganancia * c1.getCantidadDiasPorSemana();
        
        System.out.println(ganancia+"$");
    }
}
