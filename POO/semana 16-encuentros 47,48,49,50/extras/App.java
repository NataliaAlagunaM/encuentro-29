// Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
// como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
// cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
// con los parámetros que sean necesarios:
//  Constructores, tanto el vacío como el parametrizado.
//  Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
// Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
// vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
// de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
// máximas, el valor que ingresó el usuario y encontradas en 0.
//  Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
// buscar como se usa el vector.length.

// Un ejemplo de salida puede ser así:

// Ingrese una letra:
// a
// Longitud de la palabra: 6
// Mensaje: La letra pertenece a la palabra
// Número de letras (encontradas, faltantes): (3,4)
// Número de oportunidades restantes: 4
// ----------------------------------------------
// Ingrese una letra:
// z
// Longitud de la palabra: 6
// Mensaje: La letra no pertenece a la palabra
// Número de letras (encontradas, faltantes): (3,4)
// Número de oportunidades restantes: 3
// ---------------------------------------------
// Ingrese una letra:
// b
// Longitud de la palabra: 6
// Mensaje: La letra no pertenece a la palabra
// Número de letras (encontradas, faltantes): (4,3)
// Número de oportunidades restantes: 2
// ----------------------------------------------
// Ingrese una letra:
// u
// Longitud de la palabra: 6
// Mensaje: La letra no pertenece a la palabra
// Número de letras (encontradas, faltantes): (4,3)
// Número de oportunidades restantes: 1
// ----------------------------------------------
// Ingrese una letra:

// q
// Longitud de la palabra: 6
// Mensaje: La letra no pertenece a la palabra
// Mensaje: Lo sentimos, no hay más oportunidades

public class App {
    public static void main(String[] args) throws Exception {
        AService as = new AService();
        Ahorcado a = new AService().crearJuego();

        while (true) {
            as.jugar(a);
            if (a.getIntentos() == a.getJugadasMaximas()) {
                System.out.println("Perdiste.");
                break;
            }
            if (a.getLongPalabra() == a.getLetrasEncontradas()) {
                System.out.println("Ganaste!");
                break;
            }
        }

    }
}
