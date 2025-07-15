package ru.aston.builder;

public class Main {
    public static final int BOOK_YEAR = 1867;
    public static final int BOOK_PAGES = 200;

    public static void main(String[] args) {
        Book book = Book.builder().author("Толстой").name("Война и мир").pages(333).year(1850).build();
        System.out.println(book);
    }
}
