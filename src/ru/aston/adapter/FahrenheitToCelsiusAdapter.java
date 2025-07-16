package ru.aston.adapter;

final public class FahrenheitToCelsiusAdapter implements Thermometer {
    private final FahrenheitThermometer fahrenheitThermometer;
    private final int shiftOfZeroPointOfScales = 32;
    private final double coefficient = 1.8D;

    public FahrenheitToCelsiusAdapter(final FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    @Override
    public double getTemperature() {
        return (fahrenheitThermometer.getTemperature() - shiftOfZeroPointOfScales) * coefficient;
    }
}