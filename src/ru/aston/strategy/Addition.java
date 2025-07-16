package ru.aston.strategy;

public final class Addition implements Strategy{
    @Override
    public int action(final int firstNumber, final int secondNumber) {
        return firstNumber + secondNumber;
    }
}