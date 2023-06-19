/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class Libro {

    String ISBN;
    String titulo;
    String autor;
    int numeroDePaginas;

    public Libro(String ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public Libro() {
    }
    
    public void cargarLibro() {
    Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese el ISBN");
        this.ISBN=leer.nextLine();
        System.out.println("Ingrese el título del libro");
        this.titulo=leer.nextLine();
        System.out.println("Ingrese el nombre del autor");
        this.autor=leer.nextLine();
        System.out.println("Ingrese el numero de paginas del libro");
        this.numeroDePaginas=leer.nextInt();
}
           
    public void libroCargado(){
        System.out.println("El ISBN es: "+this.ISBN+", el título es: "+this.titulo+", el nombre del autor es: "+this.autor+" y el número de páginas del libro es: "+this.numeroDePaginas);
    }
}
