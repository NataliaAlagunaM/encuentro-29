/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaeje1;

/**
 *
 * @author Natalia Alaguna
 */

    public class Caballo extends Animal{
    private String color;
    
    public Caballo (String nombre, String alimento, int edad, String raza){
        super (nombre, alimento, edad, raza);
        this.color = "gris";      
    } 
    
    @Override
    public void alimento() {
        System.out.println("Hola soy caballo mi nombre es "+nombre+ ", tengo "+edad+" años "+ ", soy de color "+color+ " y mi raza es "+raza);
        super.alimento();
    }
}

