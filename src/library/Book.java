package library;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publicYear;

    public Book(String bookName, Author author, int publicYear) {
        this.bookName = bookName;

        if (author == null) {
            throw new IllegalArgumentException("The author cannot be null");
        }
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    @Override
    public String toString() {
        return String.format("Book: %s by %s (published: %d)", bookName, author, publicYear);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;

        return Objects.equals(this.bookName, book.bookName) && Objects.equals(this.author, book.author) &&
                (this.publicYear == book.publicYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publicYear);
    }
}
