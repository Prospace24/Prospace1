/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:



d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.




 * @author crist
 */
public class Cadena {
    private String frase;
    private int longfrase;

    public Cadena() { 
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongfrase() {
        return longfrase;
    }

    public void setLongfrase(int longfrase) {
        this.longfrase = longfrase;
    }
    
    
}
