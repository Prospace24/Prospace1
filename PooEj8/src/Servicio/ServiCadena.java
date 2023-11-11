/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServiCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public ServiCadena() {
        Cadena c1 = new Cadena();
        do {
            System.out.println("Ingrese una Frase");
        c1.setFrase(leer.next());
        c1.setLongfrase(c1.getFrase().length());
        } while (c1.getFrase().isEmpty());
        
        mostrarVocales(c1);
        System.out.println("--------------");
        invertirFrase(c1);
        System.out.println("--------------");
        vecesRepetido(c1);
        System.out.println("--------------");
        compararLongitud(c1);
        System.out.println("--------------");
        unirFrases(c1);
        System.out.println("--------------");
        reemplazar(c1);
        System.out.println("--------------");
        contiene(c1);
        
    }
    /**
     * a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
     */
    public void mostrarVocales( Cadena c1){
       int cont = 0;
       String c;
       
        for (int i = 0; i < c1.getLongfrase(); i++) {
            
            c =c1.getFrase().substring(i, i+1);
            
            if (c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u")){
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("La Cantidad de Vocales de la Frase es: "+cont);
        }else{
            System.out.println("La Frase no Contiene Vocales");
        }
       
    }
    /**
     * b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase(Cadena c1){
        String inver="";
        String c;
        for (int i = c1.getLongfrase(); i > 0; i--) {
            c=c1.getFrase().substring(i-1, i);
            inver = inver.concat(c);
        }
        
        System.out.println("La Frase Ingresa es:");
        System.out.println("'"+c1.getFrase()+"'");
        System.out.println("'"+inver+"'");
             
    }
    /**
     * c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
     */
    public void vecesRepetido(Cadena c1){
        System.out.println("Ingrse el Caracter q desea Comparar");
        String c = leer.next();
        int cont=0;
        for (int i = 0; i < c1.getLongfrase(); i++) {
            if (c.equalsIgnoreCase(c1.getFrase().substring(i, i+1))) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("EL caracter Ingresado se encuentra "+cont+" en la Frase");
        }else{
            System.out.println("El caracter no se encuentra en la frase");
        }
    }
    /**
     * e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
     */
    public void compararLongitud(Cadena c1){
         String f;
         double c;
        System.out.println("Ingrese una Frase");
         f=leer.next();
     
        
        int lon = f.length();
        if (lon > c1.getLongfrase()) {
            System.out.println("La cadena Ingresada es Mayor");
            System.out.println("Cadena 1 "+c1.getLongfrase());
            System.out.println("Cadena 2 "+lon);
        }else if (lon == c1.getLongfrase()) {
            System.out.println("Las cadenas tienen la misma longitud");
            System.out.println("Cadena 1 "+c1.getLongfrase());
            System.out.println("Cadena 2 "+lon);
        }else{
            System.out.println("La cadena Ingresada es _Menor");
            System.out.println("Cadena 1"+c1.getLongfrase());
            System.out.println("Cadena 2"+lon);
        }
    }
    /**
     * f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrases(Cadena c1){
        
        System.out.println("Ingrese una Frase");
        String f = leer.next();
        System.out.println("Frase Resultante");
        f = c1.getFrase().concat(f);
        System.out.println(f);
    }
    /**
     * g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
     */
    public void reemplazar(Cadena c1){
        System.out.println("Ingrse el Caracter q desea Comparar");
        String c = "a";
        String f = "";
        for (int i = 0; i < c1.getLongfrase(); i++) {
            if (c.equalsIgnoreCase(c1.getFrase().substring(i, i+1))) {
                System.out.println("ingrese un caracter");
               f= f.concat(leer.next());
            }else{
                f=f.concat(c1.getFrase().substring(i, i+1));
            }
        }
        System.out.println(f);
      
    }
    /**
     * h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public void contiene(Cadena c1){
        System.out.println("Ingrese una letra");
        String l = leer.next();
        boolean vf;
        int i =0;
        while ( vf = false || i < c1.getLongfrase()) {
            
            if (l.equalsIgnoreCase(c1.getFrase().substring(i, i+1))) {
                vf=true;
            }else{
                i++;
            }
        }
        
        System.out.println("EL Caracte ingresado se encuentra en la Frase: "+vf);
    }
}
