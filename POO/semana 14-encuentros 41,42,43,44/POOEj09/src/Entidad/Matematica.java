/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author 57315
 */

/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
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

    public double getNumeroReal2() {
        return numeroReal2;
    }

    public void setNumeroReal1(double numeroReal1) {
        this.numeroReal1 = numeroReal1;
    }

    public void setNumeroReal2(double numeroReal2) {
        this.numeroReal2 = numeroReal2;
    }
    
    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(){
        return numeroReal1>numeroReal2?numeroReal1:numeroReal2; //ternario
    }
    
    /*
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
    */
    
    public double calcularPotencia(){
        double numMayor=devolverMayor();
        if (numMayor==numeroReal1){
           return Math.pow(Math.round(numeroReal1), Math.round(numeroReal2)); //(base,potencia)
        } else {
           return Math.pow(Math.round(numeroReal2), Math.round(numeroReal1));
        }
              
    }
    
   /* c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
    public double calcularRaiz(){
        double numMayor=devolverMayor();
        if (numMayor==numeroReal1) { 
            return Math.sqrt(Math.abs(numeroReal2));
        } else {
            return Math.sqrt(Math.abs(numeroReal1));
        }
    }
}
