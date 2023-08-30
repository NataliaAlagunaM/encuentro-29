/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

/**
 *
 * @author max72
 */
public class Pelicula {
    String titulo;
    String genero;
    int anio;
    double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, int anio, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' + ", genero='" + genero + '\'' + ", anio=" + anio + ", duracion=" + duracion + '}';
    }
}
