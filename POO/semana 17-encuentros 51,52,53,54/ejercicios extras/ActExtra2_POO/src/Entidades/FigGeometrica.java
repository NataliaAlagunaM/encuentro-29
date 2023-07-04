/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author rembecuadro
 */
public class FigGeometrica {
    
    private String tipo; // Para identificar el tipo de figura
    
    private int lado;
    private int base;
    private int altura;
    private int radio;
    private int hipotenusa;
    private int catetoA;
    private int catetoB;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(int hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public int getCatetoA() {
        return catetoA;
    }

    public void setCatetoA(int catetoA) {
        this.catetoA = catetoA;
    }

    public int getCatetoB() {
        return catetoB;
    }

    public void setCatetoB(int catetoB) {
        this.catetoB = catetoB;
    }

    
    /*
    public FigGeometrica(int lado, int base, int altura, int diagonal, int diagonal2, int radio, int hipotenusa, int catetoO, int catetoA) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.diagonal = diagonal;
        this.diagonal2 = diagonal2;
        this.radio = radio;
        this.hipotenusa = hipotenusa;
        this.catetoO = catetoO;
        this.catetoA = catetoA;
    }
    */
    
    public FigGeometrica() {
    }
    
}
