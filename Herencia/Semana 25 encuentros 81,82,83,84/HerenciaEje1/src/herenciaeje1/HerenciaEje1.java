/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaeje1;

/**
 *
 * @author Natalia Alaguna
 */
public class HerenciaEje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro = new Perro("Rufus", "Comida de perros", 9, "pug");
        perro.alimento();
        
        Gato gato = new Gato("firu", "Comida de gatos", 7, "balinés");
        gato.alimento();
        
        Caballo caballo = new Caballo("gordi", "Comida de caballo", 10, "Azteca");
        caballo.alimento();
        
        
    }
    
}
