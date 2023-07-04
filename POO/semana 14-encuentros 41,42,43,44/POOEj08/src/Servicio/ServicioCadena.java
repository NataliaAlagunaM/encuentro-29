/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class ServicioCadena {
    /*
     En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada.
    */
    
    Scanner leer = new Scanner (System.in);
    
    public Cadena crearCadena(){
        Cadena nuevaCadena = new Cadena();
        System.out.println("Ingrese una frase:");
        nuevaCadena.setFrase(leer.nextLine());
        nuevaCadena.setLongitud(nuevaCadena.getFrase().length());
        
        return nuevaCadena;
    }
    
        /*
    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
    */ 
    
    public void mostrarVocales(Cadena cadena){
        String frase=cadena.getFrase();
        frase=frase.toLowerCase();
        int longi=cadena.getLongitud();
        int contador=0;
        for (int i = 0; i < longi; i++) {
            
        if (frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u') {
            contador += 1;
        }
        }
        System.out.println("En la frase: "+frase+", hay "+contador+ " vocales");
    }
/*
    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    */
    
    public void invertirFrase(Cadena cadena){
       String frase=cadena.getFrase();
       int longi=cadena.getLongitud();
       String fraseInvertida="";

       StringBuilder stringBuilder = new StringBuilder(frase);
       String invertida = stringBuilder.reverse().toString();
       System.out.println("La frase invertida es: "+invertida);

    }
    
     /*
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    */
    
    public void vecesRepetido(Cadena cadena){
        String letra="";
        String frase= cadena.getFrase();
        int longi = cadena.getLongitud();
       
        System.out.println("Ingrese la letra que desea buscar en la frase: ");
        letra = leer.nextLine();
        int contador=0;
        for (int i = 0; i < longi; i++) {
            if (frase.charAt(i)==letra.charAt(0)) {
                contador += 1;
            } 
        }
        System.out.println("la letra "+ letra+ ", se encuentra en la frase: "+ frase+" "+contador +" veces");
    }
    
        /*
    e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
    */
    
    public void compararLongitud(Cadena cadena){
        int longi = cadena.getLongitud();
        
        System.out.println("Ingrese la frase con la que desea comparar: ");
        String fraseNueva=leer.nextLine();
        int longiNueva=fraseNueva.length();
        int caracter;
        if (longi>longiNueva) {
            caracter=longi-longiNueva;
            System.out.println("la frase original es más larga que la nueva por "+caracter+" caracteres");
        } else if (longiNueva>longi){
            caracter=longiNueva-longi;
            System.out.println("la frase nueva es más larga que la original por "+caracter+" caracteres");
        }
    }
    
        /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    */
    
    public void unirFrases(Cadena cadena){
        String frase= cadena.getFrase();
        System.out.println("Ingrese la frase que desea unir: ");
        String fraseNueva=leer.nextLine();
        
        String fraseUnida;
        fraseUnida=frase.concat(fraseNueva);
        System.out.println(fraseUnida);
    }
    
        /*
    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
    */
    
    public void reemplazar(Cadena cadena){
        String frase= cadena.getFrase();
        int longi = cadena.getLongitud();
        
        System.out.println("Ingrese el caracter por el que quiere reemplazar la a:");
        String c = leer.nextLine();
        
        String fraseNueva;
        fraseNueva= frase.replace("a", c);
        System.out.println("la frase nueva es: "+fraseNueva);
    }
    
        /*
    h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    */
    
    public void contiene(Cadena cadena){
        String frase= cadena.getFrase();
        int longi = cadena.getLongitud();
        System.out.println("Ingrese la letra que quiere verificar que está en la frase");
        String letra=leer.nextLine();
        boolean resultado=false;
        
        for (int i = 0; i < longi; i++) {
            if (frase.charAt(i)==letra.charAt(0)) {
               resultado=true;
            } 
        }
        System.out.println(resultado);
        
    }
    
    
}
