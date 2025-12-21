package task1;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Added to library " + book.getTitle());
        } else {
            System.out.println("task1.Library is full");
        }
    }
    public void showAvailableBooks() {
        System.out.println("Available Books");
        boolean hasBook = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println(books[i].toString());
                hasBook = true;
            }
        }
        if (!hasBook) {
            System.out.println("No books available");
        }
    }
}
