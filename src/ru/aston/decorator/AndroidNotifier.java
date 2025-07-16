package ru.aston.decorator;

public class AndroidNotifier extends NotifierDecorator {
    public AndroidNotifier(Notifier wrappedNotifier) {
        super(wrappedNotifier);
    }
}