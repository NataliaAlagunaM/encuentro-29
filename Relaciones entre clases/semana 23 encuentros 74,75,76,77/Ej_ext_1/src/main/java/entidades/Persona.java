package entidades;

public class Persona {
    private String nombre;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, Perro perro) {
        this.nombre = nombre;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Perro getPerro() {
        return perro;
    }

    public Persona setPerro(Perro perro) {
        this.perro = perro;
        return this;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", perro=" + perro +
                '}';
    }
}
