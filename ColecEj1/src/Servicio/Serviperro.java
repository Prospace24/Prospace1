/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Serviperro {
    
    private ArrayList<Perro> razas;
    private Scanner leer;
    private Iterator<Perro>it;

    public Serviperro() {
        this.razas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.it = razas.iterator();
    }
    
    public Perro crearPerro(){
        System.out.println("Ingrese el nombre del Perro ");
        String no = leer.next();
        System.out.println("Ingrese la edad");
        Integer ed = leer.nextInt();
        System.out.println("Ingrese la Raza");
        String ras = leer.next();
        return  new Perro(ras, no, ed);
    }
    
    public void agregarPerro(Perro p1){
        razas.add(p1);
    }
    public void mostrarPerro(){
        for (Perro raza : razas) {
            System.out.println(raza.toString());
        }
    }
    public void eliminarRaza(String ras){
        
        for (int i = 0; i < razas.size(); i++) {
            Perro p = razas.get(i);
            if (p.getNom().equals(ras)) {
                razas.remove(i);
                
            }
        }
        
    }
    
    
    
    
}
