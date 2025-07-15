package ru.aston.builder;

final public class Book {
    private final String name;
    private final String author;
    private final int year;
    private final int pages;

    private Book(final String name, final String author, final int year, final int pages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Книга: " + name + "; Автор: " + author + "; Год: " + year + "; Страницы: " + pages;
    }

    public static final class Builder {
        private String name;
        private String author;
        private int year;
        private int pages;

        private Builder() {
        }

        public Builder name(final String name) {
            this.name = name;
            return this;
        }

        public Builder author(final String author) {
            this.author = author;
            return this;
        }

        public Builder year(final int year) {
            this.year = year;
            return this;
        }

        public Builder pages(final int pages) {
            this.pages = pages;
            return this;
        }

        public Book build() {
            if (name == null || author == null) {
                throw new IllegalStateException("Name and author are required");
            }
            return new Book(name, author, year, pages);
        }
    }
}