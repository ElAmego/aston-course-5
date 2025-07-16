package ru.aston.chain;

final class ManagerHandler extends BasePurchaseHandler {
    private static final int LIMIT = 1000;

    @Override
    public void handleRequest(final int amount) {
        if (amount <= LIMIT) {
            System.out.println("Менеджер одобрил покупку на $" + amount);
        } else {
            super.handleRequest(amount);
        }
    }
}