/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaconjunit.Service.Comparators;

import holaconjunit.PeliculaClass.Pelicula;
import java.util.Comparator;

/**
 *
 * @author max72
 */
public class Comparators {

    public static Comparator<Pelicula> ordenarPorDirectorAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
    public static Comparator<Pelicula> ordenarPorDirectorDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDirector().compareTo(o1.getDirector());
        }
    };
    public static Comparator<Pelicula> ordenarPorTituloAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarPorTituloDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getTitulo().compareTo(o1.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracionEnHoras().compareTo(o2.getDuracionEnHoras());
        }
    };
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracionEnHoras().compareTo(o1.getDuracionEnHoras());
        }
    };

}
