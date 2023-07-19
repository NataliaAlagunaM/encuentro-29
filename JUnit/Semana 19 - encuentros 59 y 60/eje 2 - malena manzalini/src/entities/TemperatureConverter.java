package entities;

/*
Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.
 */
public class TemperatureConverter {

    public double farenheitACelsius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }

    public double celsiusAFarenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double farenheitAKelvin(double farenheit) {
        return ((farenheit - 32) * 5 / 9) + 273.15;
    }

    public double celsiusAKelvin(double celsius) {
        return (celsius + 273.15);
    }

    public double kelvinAFarenheit(double kelvin) {
        return 5 / 9 * (kelvin - 273.15) + 32;
    }

    public double kelvinACelsius(double kelvin) {
        return (kelvin - 273.15);
    }

}
