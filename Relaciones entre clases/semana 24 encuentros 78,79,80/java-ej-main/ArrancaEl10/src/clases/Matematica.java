/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author max72
 */
public class Matematica {
    double numeroReal1;
    double numeroReal2;

    public Matematica() {
    }

    public Matematica(double numeroReal1, double numeroReal2) {
        this.numeroReal1 = numeroReal1;
        this.numeroReal2 = numeroReal2;
    }

    public double getNumeroReal1() {
        return numeroReal1;
    }

    public void setNumeroReal1(double numeroReal1) {
        this.numeroReal1 = numeroReal1;
    }

    public double getNumeroReal2() {
        return numeroReal2;
    }

    public void setNumeroReal2(double numeroReal2) {
        this.numeroReal2 = numeroReal2;
    }
    
    public double devolverMayor(){
        return numeroReal1>numeroReal2?numeroReal1:numeroReal2;
    }
    
    public double calcularPotencia (){
       double mayor = devolverMayor();
       if (mayor == numeroReal1)
           return Math.pow(Math.round(numeroReal1),Math.round(numeroReal2));
       else
           return Math.pow(Math.round(numeroReal2),Math.round(numeroReal1));
    }
    
    public double calcularRaiz(){
        double mayor = devolverMayor();
        if (mayor == numeroReal1){
            
            Math.abs(numeroReal2);
            return Math.sqrt(numeroReal2);
        }
        else
        {
            Math.abs(numeroReal1);
            return Math.sqrt(numeroReal1);
        }
    }
    
    static public double devolverMayor(double num1, double num2){
        return num1>num2?num1:num2;
    }
    
}
