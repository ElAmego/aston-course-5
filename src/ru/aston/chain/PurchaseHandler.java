package ru.aston.chain;

interface PurchaseHandler {
    void setNext(PurchaseHandler handler);
    void handleRequest(int amount);
}