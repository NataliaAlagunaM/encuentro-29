/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.TemperatureConverter;
import java.util.Scanner;

/**
 *
 * @author 57315
 */
public class TemperatureConverterServicio {
    Scanner leer = new Scanner(System.in);
    public double ValorFinal(TemperatureConverter tc1){
     //1 celcius , 2 Fahrenheit,, 3 kelvin
     double result=0;
        switch (tc1.getOriginal()){
            case 1:
        switch (tc1.getConvert()) {
            case 1:
                result = tc1.getTemp();
                break;

            case 2:
                result = (tc1.getTemp()*(9/5))+32;
                break;

                
            case 3:
                result = tc1.getTemp()+ 273.15;
                break;

            default:
                break;
        }
                break;
                
            case 2:
        switch (tc1.getConvert()) {
            case 2:
                result = tc1.getTemp();
                break;

            case 1:
                result = (tc1.getTemp()-32)*(5/9);
                break;

            case 3:
                result = (tc1.getTemp()-32)*(5/9)+(273.15);
                break;

        }
                break;
                
            case 3:
        switch (tc1.getConvert()) {
            case 3:
                result = tc1.getTemp();
                break;
            case 1:
                result = (tc1.getTemp()-273.15);
                break;
            case 2:
                result = (tc1.getTemp()-273.15)*(9/5)+32;
                break;
        }
                break;
        }
        return result;
    

    }
}



