package ru.aston.proxy;

public class Main {
    public static void main(String[] args) {
        Document realDocument = new RealDocument("filepath");
        Document proxyDocument = new ProxyDocument(realDocument);
        System.out.println(proxyDocument.getPath());
    }
}
