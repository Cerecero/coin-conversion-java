package TemperatureConversion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Temperature {
//farenheit F, Celsisu C, Kelvin K
    public static Map<String, Double> InputToKelandFar(double input){
        Map<String, Double> result = new HashMap<>();
        double KELVIN = input + 273.15;
        double FARENHEIT = ((9/5) * input) + 32;
        result.put("Kel", KELVIN);
        result.put("Far", FARENHEIT);
        return result;
    }


}
