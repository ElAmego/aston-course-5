package ru.aston.chain;

public class Main {
    public static void main(String[] args) {
        PurchaseHandler manager = new ManagerHandler();
        PurchaseHandler director = new DirectorHandler();
        PurchaseHandler president = new PresidentHandler();

        manager.setNext(director);
        director.setNext(president);

        manager.handleRequest(500);
        manager.handleRequest(2500);
        manager.handleRequest(10000);
    }
}