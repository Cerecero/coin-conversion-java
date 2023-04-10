package TemperatureConversion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Temperature {
//farenheit F, Celsisu C, Kelvin K
    public double CelsiustoKelvin(double input){
        double KELVIN = input + 273.15;
        return KELVIN;
    }
    public double CelsiustoFahrenheit(double input){
        double FAHRENHEIT = (input * 9/5) + 32;
        return FAHRENHEIT;
    }
    public double FahrenheittoCelsius(double input){
        double CELSIUS = (input - 32) * 5/9;
        return CELSIUS;
    }
    public double FahrenheittoKelvin(double input){
        double KELVIN = (input - 32) * 5/9 + 273.15 + 32;
        return KELVIN;
    }



}
