package ru.aston.adapter;

final public class CelsiusThermometer implements Thermometer {
    private final double temperature;

    public CelsiusThermometer(final double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }
}