/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeraciones.Apellido;
import Enumeraciones.Nombres;
import java.util.ArrayList;
import java.util.List;

//La clase Simulador debe tener un método que genere un listado de alumnos manera
//aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
//manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
public class Simulador {

    public List<Integer> listaDnis(ArrayList d) {
        int dni;
        
        for (int i = 0; i < 10; i++) {
            dni = ((int) (Math.random() * 100000) + 0);
            d.add(dni);
        }
        return d;
    }

    public List<Alumno> listaAlumnos() {
        ArrayList<Integer> listaAuxDni = new ArrayList<>();
        ArrayList<Alumno> listaAuxAlum = new ArrayList<>();
        listaDnis(listaAuxDni);
        for (int i = 0; i < 10; i++) {
            Alumno a = new Alumno();
            a.setNombre(Nombres.randomNombres());
            a.setApellido(Apellido.randomApellidos());
            a.setDni(listaAuxDni.get(i));
            a.setCantVotos(0);
            listaAuxAlum.add(a);
        }
        return listaAuxAlum;
    }

    public void mostrarListaAlum() {
        System.out.println(listaAlumnos());
    }

    
    public void votacion(List listaAlum){
        ArrayList<Voto> listVotos = new ArrayList<>();
        
        for (int i = 0; i < listaAlum.size(); i++) {
            Voto votoAlumno = new Voto();

        }
        
    }
}
