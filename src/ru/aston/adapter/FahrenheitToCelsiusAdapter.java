package ru.aston.adapter;

final public class FahrenheitToCelsiusAdapter implements Thermometer {
    private final FahrenheitThermometer fahrenheitThermometer;

    public FahrenheitToCelsiusAdapter(final FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    @Override
    public double getTemperature() {
        return (fahrenheitThermometer.getTemperature() - 32) * 5 / 9;
    }
}