/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;

/**
 *
 * @author max72
 */
public class Libro {
    String isbn;
    String titulo;
    String autor;
    int numeroDePaginas;
    
    Libro Libro (){
        return this;
    }
    
    Libro Libro (String isbn,String titulo, String autor, int numeroDePaginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        return this;
    }
    
    public Libro cargarPidiendoDatos (){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese ISBN");
        this.isbn = leer.nextLine();
        System.out.println("Ingrese titulo");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese autor");
        this.autor = leer.nextLine();
        System.out.println("Ingrese numero de paginas");
        this.numeroDePaginas = leer.nextInt();
        
        return this;
    }
    
    public void escribirInfo(){
        System.out.println("ISBN: " + this.isbn + ", Titulo: " + this.titulo + ", Autor: " + this.autor + ", Page Count: " + this.numeroDePaginas);
        
    }
}
