package ru.aston.builder;

public class Main {
    public static final int BOOK_YEAR = 1867;
    public static final int BOOK_PAGES = 200;

    public static void main(String[] args) {
        Book book = new Book.Builder("Война и мир", "Толстой").setYear(BOOK_YEAR).setPages(BOOK_PAGES)
                .build();

        System.out.println(book);
    }
}
