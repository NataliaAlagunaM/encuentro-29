/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author ceciy
 */
public class RazasPerro {
    private String raza;

    public RazasPerro() {
    }

    public RazasPerro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "RazasPerro{" + "raza=" + raza + '}';
    }
    
    
}
