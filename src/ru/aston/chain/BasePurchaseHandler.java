package ru.aston.chain;

public class BasePurchaseHandler implements PurchaseHandler {
    protected PurchaseHandler nextHandler;

    @Override
    public void setNext(PurchaseHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(int amount) {
        if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}
