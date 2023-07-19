/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author 57315
 */
public class TemperatureConverter {
    private double temp;
    private int convert;
    private int original;

    public TemperatureConverter() {
    }

    public TemperatureConverter(double temp, int original, int convert) {
        this.temp = temp;
        this.convert = convert;
        this.original = original;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getConvert() {
        return convert;
    }

    public void setConvert(int convert) {
        this.convert = convert;
    }

    public int getOriginal() {
        return original;
    }

    public void setOriginal(int original) {
        this.original = original;
    }
    
    
    
}
