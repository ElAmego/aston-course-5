package ru.aston.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int firstNumber;
        final int secondNumber;

        final Map<Integer, Strategy> actionMap = new HashMap<>();
        actionMap.put(1, new Addition());
        actionMap.put(2, new Subtraction());

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер действия\n1 -> Сумма\n2 -> Вычитание");

        final int action = scanner.nextInt();

        System.out.println("Введите первое целое число");
        firstNumber = scanner.nextInt();

        System.out.println("Введите второе целое число");
        secondNumber = scanner.nextInt();

        if (actionMap.containsKey(action)) System.out.println("Результат: " +
                actionMap.get(action).action(firstNumber, secondNumber));
    }
}