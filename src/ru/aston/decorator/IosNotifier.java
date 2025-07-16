package ru.aston.decorator;

public class IosNotifier extends NotifierDecorator{
    public IosNotifier(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }

    @Override
    public String send(String message) {
        return super.send(message) + "\nIOS уведомление: " + message;
    }
}