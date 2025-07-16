package ru.aston.chain;

class PresidentHandler extends BasePurchaseHandler {
    @Override
    public void handleRequest(final int amount) {
        System.out.println("Президент компании одобрил покупку на $" + amount);
    }
}
