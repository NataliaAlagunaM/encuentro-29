/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jbi
 */
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    ArrayList<Carta> ALC = new ArrayList<>();
    ArrayList<Carta> cartasOut = new ArrayList<>();

    public Baraja() {
        Carta car = null;
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i < 13; i++) {
                if (i == 8 || i == 9)
                    continue;
                switch (j) {
                    case 0:
                        car = new Carta(i, "Oro");
                        break;
                    case 1:
                        car = new Carta(i, "Basto");
                        break;
                    case 2:
                        car = new Carta(i, "Espada");
                        break;
                    case 3:
                        car = new Carta(i, "Copa");
                        break;

                }
                ALC.add(car);
            }
        }
    }

    public ArrayList<Carta> getALC() {
        return ALC;
    }

    // â€¢ barajar(): cambia de posiciÃ³n todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(ALC);
    }
    // â€¢ siguienteCarta(): devuelve la siguiente carta que estÃ¡ en la baraja, cuando no haya mÃ¡s o
// se haya llegado al final, se indica al usuario que no hay mÃ¡s cartas.

    public Carta siguienteCarta(){
        Carta car = null;
        if (ALC.size() > 0) {
            car = ALC.get(0);
            cartasOut.add(car);
            ALC.remove(0);
        } 
        return car;
    }

    // â€¢ cartasDisponibles(): indica el nÃºmero de cartas que aÃºn se puede repartir.
    public int cartasDisponibles(){
        return ALC.size();
    }
    // â€¢ darCartas(): dado un nÃºmero de cartas que nos pidan, le devolveremos ese nÃºmero de
// cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
// debemos indicÃ¡rselo al usuario.
    public ArrayList<Carta> darCartas(int n){
        ArrayList<Carta> car = new ArrayList<>();
        if (ALC.size() >= n) {
            for (int i = 0; i < n; i++) {
                car.add(ALC.get(0));
                cartasOut.add(ALC.get(0));
                ALC.remove(0);
            }
        } 
        return car;
    }

    // â€¢ cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    // indicÃ¡rselo al usuario
    public void cartasMonton(){
        if (ALC.size() == 40) {
                System.out.println("No han salido cartas.");
        } else {
            System.out.println("Cartas que han salido: ");
            for (Carta carta : cartasOut) {
                System.out.println(carta.toString());
            }
        }
    }

    
// â€¢ mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
// luego se llama al mÃ©todo, este no mostrara esa primera carta.
    public void mostrarBaraja(){
        System.out.println("Cartas que quedan en la baraja: ");
        if (ALC.size() == 0)
            System.out.print("0");
        for (Carta carta : ALC) {
            System.out.println(carta.toString());
        }
    }


}
