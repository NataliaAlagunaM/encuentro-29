// Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
// y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
// contener un método toString() que retorne el número de carta y el palo. La baraja estará
// compuesta por un conjunto de cartas, 40 exactamente.
// Las operaciones que podrá realizar la baraja son:

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Baraja baraja = new Baraja();
        Scanner sc = new Scanner(System.in);
        menu: while (true) {
            System.out.println("-------------------------");
            System.out.println("Ingrese opcion del menu:");
            System.out.println("1. Barajar");
            System.out.println("2. Siguiente carta");
            System.out.println("3. Cartas disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Cartas monton");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    baraja.barajar();
                    break;
                case 2:
                    Carta ca = baraja.siguienteCarta();
                    if (ca == null)
                        System.out.println("No hay cartas disponibles");
                    else
                        System.out.println("La siguiente carta es: " + ca.toString());
                    break;
                case 3:
                    System.out.println("Cantidad de cartas disponibles: " + baraja.cartasDisponibles());
                    break;
                case 4:
                    System.out.println("¿Cuantas cartas querés sacar?");
                    int cant = sc.nextInt();
                    ArrayList<Carta> devueltas = baraja.darCartas(cant);
                    if (devueltas.size() == 0)
                        System.out.println("No hay cartas disponibles");
                    else {
                        System.out.println("Se han devuelto " + devueltas.size() + " cartas");
                        System.out.println(devueltas.toString());
                    }
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break menu;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        sc.close();
    }
}
