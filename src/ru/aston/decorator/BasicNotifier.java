package ru.aston.decorator;

public class BasicNotifier implements Notifier {
    @Override
    public String send(String message) {
        return "Базовое уведомление: " + message;
    }
}
