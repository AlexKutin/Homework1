public class BooksLibrary {

    public static void main(String[] args) {
        Author authorTolstoy = new Author("Lev", "Tolstoy");
        Author authorKing = new Author("Stephen", "King");

        Library library = new Library(10);

        library.addBook(new Book("The Dark Tower", authorKing, 1982));
        library.addBook(new Book("Desperation", authorKing, 1996));
        library.addBook(new Book("The Stand", authorKing, 1978));

        library.addBook(new Book("War & Peace", authorTolstoy, 1863));
        library.addBook(new Book("Anna Karenina", authorTolstoy, 1878));

        library.printAllBooks();
        System.out.println();

        library.printBookInfoByName("War & Peace");
        library.printBookInfoByName("A Confession");

        if (library.changePublicYearByName("The Dark Tower", 1998) != null) {
            library.printBookInfoByName("The Dark Tower");
        }
    }
}
