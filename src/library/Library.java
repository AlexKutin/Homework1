package library;

public class Library {
    private final Book[] books;
    private int countBooks = 0;

    public Library(int sizeLibrary) {
        books = new Book[sizeLibrary];
    }

    public void addBook(Book book) {
        if (countBooks < books.length) {
            books[countBooks] = book;
            countBooks++;
        } else {
            throw new IndexOutOfBoundsException("Количество книг достигло максимума в библиотеке " + countBooks);
        }
    }

    public void printAllBooks() {
        for (Book book: books) {
            if (book != null) {
                System.out.printf("%s %s: %s: %s\n",
                        book.getAuthor().getFirstName(),
                        book.getAuthor().getLastName(),
                        book.getBookName(),
                        book.getPublicYear());
            }
        }
    }

    public Book findBookByName(String bookName) {
        for (int i = 0; i < countBooks; i++) {
            Book book = books[i];
            if (bookName != null && bookName.equals(book.getBookName())) {
                return book;
            }
        }
        return null;
    }

    public void printBookInfoByName(String bookName) {
        Book book = findBookByName(bookName);
        if (book != null) {
            System.out.printf("%s by %s was published in %d\n", book.getBookName(), book.getAuthor().getFullName(), book.getPublicYear());
        } else {
            System.out.printf("Book not found: %s\n", bookName);
        }
    }

    public Book changePublicYearByName(String bookName, int newPublicYear) {
        Book book = findBookByName(bookName);
        if (book != null) {
            book.setPublicYear(newPublicYear);
            return book;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book book: books) {
            if (book != null) {
                sb.append(book).append("\n");
            }
        }
        return sb.toString();
    }
}
