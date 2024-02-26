public class Main {
    public static void main(String[] args) {
        Library librarySystem = new Library();
        Book firstBook = new Book(1,"Deepanshu","The Boy",true);
        Book secondBook = new Book(2,"Vishal","The Boy 2",true);
        librarySystem.addBook(firstBook);
        librarySystem.addBook(secondBook);

        // After adding book print books;
        librarySystem.displayBooks();

        librarySystem.deleteBook(1);

        // After removing book print books;
        librarySystem.displayBooks();

        // Search book by ID
        librarySystem.searchBook(2);
    }
}