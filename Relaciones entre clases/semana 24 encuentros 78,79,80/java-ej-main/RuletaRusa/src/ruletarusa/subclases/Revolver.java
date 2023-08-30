/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusa.subclases;

/**
 *
 * @author max72
 */
public class Revolver {
    int posicionActual;//1 a 6
    int posicionBala; //1 a 6

    public Revolver() {
        this.posicionActual = (int) (Math.random()*6)+1; //dar un numero entre 1 y 6 al azar
        this.posicionBala = (int) (Math.random()*6)+1; //eco
    }
    
    public void llenarRevolver(){
        this.posicionActual = (int) (Math.random()*6)+1; //dar un numero entre 1 y 6 al azar
        this.posicionBala = (int) (Math.random()*6)+1; //eco
    }
    
    public boolean mojar(){
        return posicionBala == posicionActual;
    }
    
    public void siguienteChorro(){
        this.posicionActual = (int) (Math.random()*6)+1; //dar un numero entre 1 y 6 al azar
    }

    @Override
    public String toString() {
        return "Revolver en" + " " + posicionActual + ", bala en " + posicionBala;
    }
    
    
    
}
