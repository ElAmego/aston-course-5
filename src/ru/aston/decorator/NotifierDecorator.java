package ru.aston.decorator;

public class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(final Notifier wrappedNotifier) {
        this.wrappedNotifier = wrappedNotifier;
    }

    @Override
    public String send(String message) {
        return wrappedNotifier.send(message);
    }
}