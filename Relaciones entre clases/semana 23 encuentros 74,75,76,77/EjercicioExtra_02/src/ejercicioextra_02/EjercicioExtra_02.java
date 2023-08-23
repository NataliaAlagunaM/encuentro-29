/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra_02;

import Entidades.Cine;
import Servicio.ServicioCine;

/**
 *
 * @author Martin
 */
public class EjercicioExtra_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioCine sc = new ServicioCine();

        
        sc.llenarMatriz();
        sc.mostrarMatrix();
        System.out.println("");
        sc.crearEspectadores();
        sc.precioEntrada();
        sc.crearPelicula();
        
        sc.ubicarEspectador();
        sc.mostrarMatrix();

    }

}
