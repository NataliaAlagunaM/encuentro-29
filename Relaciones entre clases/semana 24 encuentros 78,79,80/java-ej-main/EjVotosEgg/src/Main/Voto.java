/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;

/**
 *
 * @author max72
 */
class Voto {
    Alumno votante;
    List<Alumno> votados;

    Voto(Alumno votante, List<Alumno> votados) {
        this.votante = votante;
        this.votados = votados;
    }
}