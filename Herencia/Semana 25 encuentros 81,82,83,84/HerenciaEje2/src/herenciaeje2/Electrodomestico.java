/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaeje2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Natalia Alaguna
 */

/*
    Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. 
    */
public class Electrodomestico {
    
    float precio;
    String color;
    char consumo;
    float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color, char consumo, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    

    
    
      //Aquí inician los métodos solicitados por ejercicio:

    /*
     Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
    */
    
    public char comprobarConsumoEnergetico(char letra){
        if (letra < 'A' && letra > 'F' || letra < 'a' && letra > 'f') {
            return letra='f';
        } else {
            return letra;
        }
        
    }
    
    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    
    public String comprobarColor(String color){
        ArrayList<String> colores = new ArrayList<>(Arrays.asList("blanco", "negro", "rojo", "azul", "gris"));
        if (colores.contains(color.toLowerCase())) {
            return color;
        } else {
            return color="blanco";
        }
    }
    /*
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
    */
    
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el color");
        this.color = leer.nextLine();
        System.out.println("Ingrese el consumo");
        this.consumo = leer.nextLine().charAt(0);
        System.out.println("Ingrese el peso");
        this.peso = leer.nextFloat();
    }
    
    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. 
*/
    public float precioFinal(char argConsumo, float argPeso) {
        precio = 1000;

        switch (argConsumo) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
        }
        if (argPeso < 20 && argPeso > 0) {
            precio += 100;
        } else if (argPeso >= 20 && argPeso < 50) {
            precio += 500;
        } else if (argPeso >= 50 && argPeso < 80) {
            precio += 800;
        } else if (argPeso >= 80) {
            precio += 1000;
        } else {
            System.out.println("no válido");
        }

        return precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
}
