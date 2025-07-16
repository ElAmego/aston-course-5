package ru.aston.adapter;

public class Main {
    public static final int CELSIUS_TEMPERATURE = 10;
    public static final int FAHRENHEIT_TEMPERATURE = 44;

    public static void main(String[] args) {
        CelsiusThermometer celsiusThermometer = new CelsiusThermometer(CELSIUS_TEMPERATURE);
        System.out.println("Температура градусника по цельсию: " + celsiusThermometer.getTemperature());

        FahrenheitThermometer fahrenheitThermometer = new FahrenheitThermometer(FAHRENHEIT_TEMPERATURE);
        System.out.println("Температура градусника по фаренгейту: " + fahrenheitThermometer.getTemperature());

        FahrenheitToCelsiusAdapter fahrenheitToCelsiusAdapter = new FahrenheitToCelsiusAdapter(fahrenheitThermometer);
        System.out.println("Температура градусника по фаренгейту переведенная в цельсии: " +
                fahrenheitToCelsiusAdapter.getTemperature());
    }
}