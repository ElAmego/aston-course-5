package ru.aston.chain;

class DirectorHandler extends BasePurchaseHandler {
    private static final int LIMIT = 5000;

    @Override
    public void handleRequest(int amount) {
        if (amount <= LIMIT) {
            System.out.println("Директор одобрил покупку на $" + amount);
        } else {
            super.handleRequest(amount);
        }
    }
}