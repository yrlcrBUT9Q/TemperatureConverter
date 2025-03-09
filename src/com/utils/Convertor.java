package com.utils;

public class Convertor {

    public static double getConverterFtoC(double Celsius) {
        return (Celsius * 9 / 5) + 32; // ( °C × 9/5) + 32 =  °F
    }

    public static double getConverterСtoF(double Fahrenheit) {
        return (Fahrenheit - 32) / (9 / 5); // ( °C × ) = (°F - 32) / (9/5)
    }
}
