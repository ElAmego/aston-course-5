package ru.aston.builder;

final public class Book {
    private final String name;
    private final String author;
    private final int year;
    private final int pages;

    private Book(final Builder builder) {
        this.name = builder.name;
        this.author = builder.author;
        this.year = builder.year;
        this.pages = builder.pages;
    }

    @Override
    public String toString() {
        return "Книга: " + name + "; Автор: " + author + "; Год: " + year + "; Страницы: " + pages;
    }

    final public static class Builder {
        private final String name;
        private String author;

        private int year = 0;
        private int pages = 0;

        public Builder(final String name, final String author) {
            this.name = name;
            this.author = author;
        }

        public Builder setYear(final int year) {
            this.year = year;
            return this;
        }

        public Builder setPages(final int pages) {
            this.pages = pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}