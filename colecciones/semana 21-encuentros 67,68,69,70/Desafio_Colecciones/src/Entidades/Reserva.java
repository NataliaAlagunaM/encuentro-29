package Entidades;

import java.util.ArrayList;

public class Reserva {
    private Integer id;
    private String fechaEntrada;
    private String fechaSalida;
    private int numeroHabitacion;
    private ArrayList<Persona> listaPersonas;

    public Reserva() {
    }

    public Reserva(Integer id, String fechaEntrada, String fechaSalida, int numeroHabitacion, ArrayList<Persona> listaPersonas) {
        this.id = id;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
        this.listaPersonas = listaPersonas;
    }

    public Integer getId() {
        return id;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", numeroHabitacion=" + numeroHabitacion +
                ", listaPersonas=" + listaPersonas +
                '}';
    }
}
