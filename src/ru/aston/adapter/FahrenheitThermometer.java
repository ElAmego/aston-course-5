package ru.aston.adapter;

final public class FahrenheitThermometer implements Thermometer {
    private final double temperature;

    public FahrenheitThermometer(final double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }
}