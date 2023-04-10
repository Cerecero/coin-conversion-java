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


}
