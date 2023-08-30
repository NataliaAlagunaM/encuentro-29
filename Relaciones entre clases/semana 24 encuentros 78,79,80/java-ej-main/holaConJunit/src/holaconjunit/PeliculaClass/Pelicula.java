/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaconjunit.PeliculaClass;

/**
 *
 * @author max72
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double duracionEnHoras;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracionEnHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionEnHoras = duracionEnHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public void setDuracionEnHoras(Double duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }

    @Override
    public String toString() {
        return "Pelicula: \n" + "Titulo: " + titulo + "\nDirector:" + director + "\n Duracion (Hs):" + duracionEnHoras;
    }
    
}
