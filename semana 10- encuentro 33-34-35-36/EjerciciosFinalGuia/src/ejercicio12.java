
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 57315
 */

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int longitud;
    boolean verificar=true;
    int contador=0;
    int contadorIncorrecto=0;
    int contadorCorrecto=0;
    int contadorFinal=0;
        do {
            System.out.println("Ingrese una frase");
            String frase=leer.nextLine();
            frase=frase.toLowerCase();
            longitud=frase.length();
            System.out.println("la frase tiene "+longitud+" caracteres");
            
            String ultimaLetra=frase.substring(longitud-1,longitud);
            String primeraLetra=frase.substring(0,1);
            
            if(!ultimaLetra.equals("o") || (5<longitud) || (!primeraLetra.equals("x"))){
                verificar=false;
                contadorIncorrecto=contadorIncorrecto+1;
            } else if(ultimaLetra.equals("o") & (5>=longitud) & (primeraLetra.equals("x"))){
                verificar=false;
                contadorCorrecto=contadorCorrecto+1;
            }
            contador=contador+1;
            
            if (frase.equals("&&&&&")){
                verificar=true;
            }
            
        } while ((verificar == false));
        contadorFinal=contador-1;
        System.out.println("Se han ingresado "+contadorIncorrecto+ " frases mal");
        System.out.println("Se han ingresado "+contadorCorrecto+ " frases bien");
        System.out.println("Se han ingresado "+contadorFinal+ " frases en total");
    }
    
}
