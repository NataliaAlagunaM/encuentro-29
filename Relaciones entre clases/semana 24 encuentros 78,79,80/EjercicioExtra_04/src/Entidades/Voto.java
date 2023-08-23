/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.List;

/**
 *
 * @author Martin
 */
public class Voto {
    private Alumno alumnoVotante;
    private List<Alumno> listaAlumVotados;

    public Voto() {
    }

    public Voto(Alumno alumnoVotante, List<Alumno> listaAlumVotados) {
        this.alumnoVotante = alumnoVotante;
        this.listaAlumVotados = listaAlumVotados;
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    public List<Alumno> getListaAlumVotados() {
        return listaAlumVotados;
    }

    public void setListaAlumVotados(List<Alumno> listaAlumVotados) {
        this.listaAlumVotados = listaAlumVotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnoVotante=" + alumnoVotante + ", listaAlumVotados=" + listaAlumVotados + '}';
    }
    
    
}
