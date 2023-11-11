/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 * @author crist
 */
public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPag;

    public Libro() {
        
        
    }

    public Libro(String ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    public Libro crearLibro(){
        
        System.out.println("Ingrese los Datos del Libro");
        System.out.println("Ingrese el ISBN");
        String is = leer.next();
        System.out.println("Ingrese el Titulo");
        String ti = leer.next();
        System.out.println("Ingrese el sutor");
        String au = leer.next();
        System.out.println("Ingrese el numero de paginas");
        int nump = leer.nextInt();
        
        return new Libro(is, ti , au, nump);
    }

    public void MostrarLibro(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("N°Paginas: "+numPag);
    }
    
}
