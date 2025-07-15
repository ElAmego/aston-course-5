package ru.aston.decorator;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new AndroidNotifier(new IosNotifier(new BasicNotifier()));
        System.out.println(notifier.send("Привет IOS и Android пользователям!"));
    }
}
