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
public class sumaEstatica {
    private int numero1;
    private int numero2;

    public sumaEstatica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
   
    static public int sumarSinInstanciar(int num1,int num2){
    return num1+num2;
    }
    
    public int sumarSoloInstanciada (){
    return this.numero1+this.numero2;
    }
}
