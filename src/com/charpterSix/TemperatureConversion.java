package com.charpterSix;

public class TemperatureConversion {
    public static double celsiusConversion(double fahrenheit) {
        double celcius = 0;
        celcius = 5.0 / 9.0 * (fahrenheit - 32);
        return celcius;
    }

    public static double fahrenheitConversion(double celcius) {
        double fahrenheit = 0;
        fahrenheit = 9.0 / 5.0 * celcius + 32;
        return fahrenheit;
    }
}
