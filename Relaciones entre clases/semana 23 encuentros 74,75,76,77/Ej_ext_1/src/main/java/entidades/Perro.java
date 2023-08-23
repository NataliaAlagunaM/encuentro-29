package entidades;

public class Perro {
   private String nombre;
   private String raza;
   private boolean adoptado;

    public Perro() {
        adoptado=false;
    }

    public Perro(String nombre, String raza, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public Perro setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getRaza() {
        return raza;
    }

    public Perro setRaza(String raza) {
        this.raza = raza;
        return this;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public Perro setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
        return this;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", adoptado=" + adoptado +
                '}';
    }
}
