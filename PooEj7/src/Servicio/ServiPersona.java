/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int op;
 
    /**
     *  Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
     * @return 
     */
    public Persona crearPersona(){
        System.out.println("Ingrese el Nombre");
        String nom = leer.next();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        do {
            System.out.println("Ingrese el Sexo: 'H' es Hombre,'M' es Mujer; 'O' es Otro");
        String sexo = leer.next();
        sexo = sexo.toUpperCase();
            if ((sexo.equals("H")) || (sexo.equals("M")) || (sexo.equals("O"))) {
                op= 1;
            }else{
                op=0;
            }
        
        } while (op == 0);
        System.out.println("Ingrese el Peso");
        double pe = leer.nextDouble();
        System.out.println("Ingrese la Altura");
        double al = leer.nextDouble();
        
        return new Persona(nom, edad, nom, pe, al);
    }
    /**
     *  Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
     */
    public double calcularIMC(Persona p1){
        double resultado = p1.getPeso()/(Math.pow(p1.getAltura(),2));
        double IMC = 0;
        
        if (resultado < 20) {
            IMC = -1;
        }else if (resultado >= 20 && resultado <=25) {
            IMC = 0;
        }else if (resultado > 25) {
            IMC=1;
        }
          return IMC;
            
        }
    /**
     *  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
     */
    public boolean esMAyorEdad(Persona p1){
        boolean Mayor = true;
        if (p1.getEdad()< 18) {
            Mayor = false;
        }
        return Mayor;
      }
      
    }

