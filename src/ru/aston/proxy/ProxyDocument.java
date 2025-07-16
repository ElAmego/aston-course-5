package ru.aston.proxy;

public class ProxyDocument implements Document {
    Document realDocument;

    public ProxyDocument(Document realDocument) {
        this.realDocument = realDocument;
    }

    @Override
    public void getRows() {
        if (realDocument != null) realDocument.getRows();
    }

    @Override
    public void getColumns() {
        if (realDocument != null) realDocument.getColumns();
    }

    @Override
    public String getPath() {
        if (realDocument != null) {
            return realDocument.getPath();
        }

        return null;
    }
}
