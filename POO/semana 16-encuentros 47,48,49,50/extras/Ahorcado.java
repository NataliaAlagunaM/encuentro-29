public class Ahorcado {
    private String palabra;
    private int letrasEncontradas, jugadasMaximas, longPalabra, intentos;
    private char[] letras;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int letrasEncontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.longPalabra = palabra.length();
        this.letras = palabra.toCharArray();
        this.intentos = 0;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getLongPalabra() {
        this.longPalabra = palabra.length();
        return longPalabra;
    }

    public char[] getLetras() {

        this.letras = palabra.toCharArray();
        return letras;
    }

}
