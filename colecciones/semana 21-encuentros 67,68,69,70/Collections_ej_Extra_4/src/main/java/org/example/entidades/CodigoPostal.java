package org.example.entidades;

public class CodigoPostal {
    private Integer codigoPostal;
    private String ciudadAosciada;

    public CodigoPostal() {
    }

    public CodigoPostal(Integer codigoPostal, String ciudadAosciada) {
        this.codigoPostal = codigoPostal;
        this.ciudadAosciada = ciudadAosciada;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public CodigoPostal setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
        return this;
    }

    public String getCiudadAosciada() {
        return ciudadAosciada;
    }

    public CodigoPostal setCiudadAosciada(String ciudadAosciada) {
        this.ciudadAosciada = ciudadAosciada;
        return this;
    }

    @Override
    public String toString() {
        return "CodigoPostal{" +
                "codigoPostal=" + codigoPostal +
                ", ciudadAosciada='" + ciudadAosciada + '\'' +
                '}';
    }
}
