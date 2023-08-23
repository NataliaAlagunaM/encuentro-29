/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_04;

import Entidades.Alumno;
import Entidades.Simulador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Simulador s = new Simulador();
        

        ArrayList<Integer> listaAuxDni = new ArrayList<>();
        
        s.listaDnis(listaAuxDni);
        List<Alumno> listaAuxAlum = new ArrayList<>();
        listaAuxAlum = s.listaAlumnos();
        
        s.votacion(listaAuxAlum);
        s.mostrarListaAlum();
        
        
    }
    
}
