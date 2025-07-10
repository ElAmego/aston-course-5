package ru.aston.proxy;

public final class RealDocument implements Document {
    private final String filepath;

    public RealDocument(final String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void getRows() {
        System.out.println("Загрузка количества строк...");
    }

    @Override
    public void getColumns() {
        System.out.println("Загрузка количества столбцов...");
    }

    @Override
    public String getPath() {
        return filepath;
    }
}