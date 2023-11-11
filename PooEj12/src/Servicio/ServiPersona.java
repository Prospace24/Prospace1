/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 * @author crist
 */
public class ServiPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        Persona p1= new Persona();
        System.out.println("Ingrese el Nombre");
        p1.setNom(leer.next());
        System.out.println("Ingrese La Fecha de Nacimiento");
        System.out.println("Ingrese el Dia");
        p1.getFecha().setDate(leer.nextInt());
        System.out.println("Ingrese el Mes");
        p1.getFecha().setMonth(leer.nextInt()-1);
        System.out.println("Ingrese el Año");
        p1.getFecha().setYear(leer.nextInt());
        return p1;
    }
   public void calcularEdad(Persona c1){
       Date fechaActual = new Date();
       int edad;
        edad=fechaActual.getYear()-c1.getFecha().getYear();
       if (fechaActual.getDate()>=c1.getFecha().getDate()) {
           if (fechaActual.getMonth()<c1.getFecha().getMonth()) {
                edad= edad -1;
           }
       
       } else{
           if (fechaActual.getMonth()<=c1.getFecha().getMonth()) {
               edad= edad -1;
               
           }
       }
      
       System.out.println("Edad: "+" "+edad);
   }
}
