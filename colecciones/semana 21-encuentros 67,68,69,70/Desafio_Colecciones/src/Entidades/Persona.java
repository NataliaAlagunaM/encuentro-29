package Entidades;

public class Persona {
    private String nombre;
    private int edad;
    private Integer DNI;
    private String pais;

    public Persona() {
    }

    public Persona(String nombre, int edad, Integer DNI, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Integer getDNI() {
        return DNI;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Huesped/es{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", pais='" + pais + '\'' +
                '\n';
    }
}
