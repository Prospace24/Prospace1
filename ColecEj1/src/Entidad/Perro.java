/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author crist
 */
public class Perro {
    private String raza;
    private String nom;
    private Integer edad; 

    public Perro() {
    }

    public Perro(String raza, String nom, Integer edad) {
        this.raza = raza;
        this.nom = nom;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", nom=" + nom + ", edad=" + edad + '}';
    }
    
    
}
