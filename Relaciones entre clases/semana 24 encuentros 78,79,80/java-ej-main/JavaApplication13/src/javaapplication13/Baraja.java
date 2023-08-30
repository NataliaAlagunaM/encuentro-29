/*

 */
package javaapplication13;

import java.util.ArrayList;

public class Baraja {

    ArrayList<Carta> baraja = new ArrayList();

    public void crearBaraja() {
        String palo = null;
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                switch (j) {
                    case 0: 
                        palo = "Basto";
                        break;
                    case 1:
                        palo = "Oro";
                        break;
                    case 2: 
                        palo = "Espada";
                        break;
                    case 3:
                        palo = "Copa";
                        break;
                }
                baraja.add(new Carta(i,palo));
                
            }
        }
    }

}
