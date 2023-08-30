/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaextragym.Sources.Services;

import java.util.ArrayList;
import javaextragym.Sources.Classes.Rutina;

/**
 *
 * @author max72
 */
public class RutinaService {
    ArrayList <Rutina> rutinarias;
    int ia;

    public RutinaService(ArrayList<Rutina> rutinarias) {
        this.rutinarias = rutinarias;
        this.ia = 0;
    }

    public RutinaService() {
        this.rutinarias = new ArrayList <>();
        this.ia = 0;
    }
    
    
    public void crearRutina(Rutina rutina){
        rutina.setId(this.ia);
        ia++;
        this.rutinarias.add(rutina);
        
    }
    
    public ArrayList <Rutina> ObtenerRutinas(){
        for (Rutina rut : this.rutinarias){
            System.out.println(rut.toString());
        }
            
        return this.rutinarias;
    }
    
    public int actualizarRutina (int id, String nombre,int duracion,String nivelDificultad,String descripcion){
        for (Rutina rut : this.rutinarias){
            if (rut.getId() == id){
                rut.setNombre(nombre);
                rut.setDuracion(duracion);
                rut.setNivelDificultad(nivelDificultad);
                rut.setDescripcion(descripcion);
                return 1;
            }
        }
        return 0;
    }
    
    public int eliminarRutina(int id){
        for (Rutina rut : this.rutinarias){
            if (rut.getId() == id){
                this.rutinarias.remove(rut);
                return 1;
            }
        }
        return 0;
    }
    
    
}
