/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual 
 Métodos getters y setters.

7.
 * @author crist
 */
public class Cafetera {
    private int capMax= 11800;
    private int capAct;

    public Cafetera() {
        
    }

    public Cafetera(int capMax, int capAct) {
        this.capMax = capMax;
        this.capAct = capAct;
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCapAct() {
        return capAct;
    }

    public void setCapAct(int capAct) {
        this.capAct = capAct;
    }
    
}
