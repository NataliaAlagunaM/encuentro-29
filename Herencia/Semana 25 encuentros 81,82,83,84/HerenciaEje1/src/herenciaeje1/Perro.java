/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaeje1;

/**
 *
 * @author Natalia Alaguna
 */
public class Perro extends Animal{
    private boolean ladra;
    
    public Perro ( String nombre, String alimento, int edad, String raza){
        super (nombre, alimento, edad, raza);
        this.ladra = true;      
    } 
    
    @Override
    public void alimento() {
        System.out.println("Hola soy perro mi nombre es "+nombre+ ", tengo "+edad+" años "+ " y mi raza es "+raza);
        super.alimento();
    }
}
