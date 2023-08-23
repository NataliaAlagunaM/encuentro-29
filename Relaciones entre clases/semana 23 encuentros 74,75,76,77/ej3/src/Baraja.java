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

    // • barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(ALC);
    }
    // • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
// se haya llegado al final, se indica al usuario que no hay más cartas.

    public Carta siguienteCarta(){
        Carta car = null;
        if (ALC.size() > 0) {
            car = ALC.get(0);
            cartasOut.add(car);
            ALC.remove(0);
        } 
        return car;
    }

    // • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles(){
        return ALC.size();
    }
    // • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
// cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
// debemos indicárselo al usuario.
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

    // • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    // indicárselo al usuario
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

    
// • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
// luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(){
        System.out.println("Cartas que quedan en la baraja: ");
        if (ALC.size() == 0)
            System.out.print("0");
        for (Carta carta : ALC) {
            System.out.println(carta.toString());
        }
    }


}
