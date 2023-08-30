/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroClass;

/**
 *
 * @author max72
 */
public class Libro {
    String titulo;
    String autor;
    int EjemplaresEnTotal;
    int ejemplaresPrestados;

    public Libro() {
        
    }

    public Libro(String titulo, String autor, int EjemplaresEnTotal, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.EjemplaresEnTotal = EjemplaresEnTotal;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplaresEnTotal() {
        return EjemplaresEnTotal;
    }

    public void setEjemplaresEnTotal(int EjemplaresEnTotal) {
        this.EjemplaresEnTotal = EjemplaresEnTotal;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro: " + "Titulo: " + titulo + ", Autor: " + autor + ", EjemplaresEnTotal: " + EjemplaresEnTotal + ", EjemplaresPrestados: " + ejemplaresPrestados ;
    }
    
    
    
}
