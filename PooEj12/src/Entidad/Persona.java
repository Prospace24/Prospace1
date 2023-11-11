/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author crist
 */
public class Persona {
    private Date fecha = new Date();
    private String nom;

    public Persona() {
    }

    public Persona(Date fecha, String nom) {
        this.fecha = fecha;
        this.nom = nom;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Persona{" + "fecha=" + fecha + ", nom=" + nom + '}';
    }
    
}
