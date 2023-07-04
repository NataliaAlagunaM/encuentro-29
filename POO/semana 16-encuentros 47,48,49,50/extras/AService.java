import java.util.Scanner;

public class AService {
    Scanner s = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado a = new Ahorcado();
        System.out.println("Ingrese palabra: ");
        a.setPalabra(s.next());
        System.out.println("Ingrese jugadas Máximas.");
        a.setJugadasMaximas(s.nextInt());
        a.setLetrasEncontradas(0);
        System.out.println("--------------------");
        return a;
    }

    //  Método buscar(letra): este método recibe una letra dada por el usuario y
    // busca sila
    // letra ingresada es parte de la palabra o no. También informará si la letra
    // estaba o no.
    public Boolean buscar(char letra, Ahorcado a) {
        char[] letras = a.getLetras();
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                return true;
            }
        }
        return false;
    }

    //  Método encontradas(letra): que reciba una letra ingresada por el usuario y
    // muestre
    // cuantas letras han sido encontradas y cuantas le faltan. Este método además
    // deberá
    // devolver true si la letra estaba y false si la letra no estaba, ya que, cada
    // vez que se
    // busque una letra que no esté, se le restará uno a sus oportunidades.
    public int encontradas(char letra, Ahorcado a) {
        int cantidadEncontradas = 0;
        char[] letras = a.getLetras();
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra) {
                cantidadEncontradas++;
            }
        }
        return cantidadEncontradas;
    }

    //  Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public int intentos(Ahorcado a) {
        return a.getJugadasMaximas() - a.getIntentos();
    }

    //  Método juego(): el método juego se encargará de llamar todos los métodos
    // previamente mencionados e informará cuando el usuario descubra toda la
    // palabra o
    // se quede sin intentos. Este método se llamará en el main.
    public void jugar(Ahorcado a) {
        a.setIntentos(a.getIntentos() + 1);
        System.out.println("Ingrese letra para buscar: ");
        char l = s.next().charAt(0);
        a.setLetrasEncontradas(a.getLetrasEncontradas() + encontradas(l, a));

        if (this.buscar(l, a)) {
            System.out.println("Se encontró la letra: '" + l + "' en la palabra " + encontradas(l, a) + " veces. "
                    + "(" + a.getLetrasEncontradas() + "," + (a.getLongPalabra()-a.getLetrasEncontradas()) + ")");
        } else {
            System.out.println("No se encontro la letra en la palabra.");
        }
        System.out.println("Quedan " + this.intentos(a) + " intentos");
    }

}
