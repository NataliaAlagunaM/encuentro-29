/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej08;

import Entidad.Cadena;
import Servicio.ServicioCadena;

/**
 *
 * @author 57315
 */
public class POOEj08 {

    /**
     * @param args the command line arguments
     */
    
    /*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
*/
    
    public static void main(String[] args) {
        ServicioCadena nvaCadena=new ServicioCadena();
        Cadena c1=nvaCadena.crearCadena();
        nvaCadena.mostrarVocales(c1);
        nvaCadena.invertirFrase(c1);
        nvaCadena.vecesRepetido(c1);
        nvaCadena.compararLongitud(c1);
        nvaCadena.unirFrases(c1);
        nvaCadena.reemplazar(c1);
        nvaCadena.contiene(c1);
        

    }
    
}
