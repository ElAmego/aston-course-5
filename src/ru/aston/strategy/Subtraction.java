package ru.aston.strategy;

public final class Subtraction implements Strategy {
    @Override
    public int action(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}