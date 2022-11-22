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
}
