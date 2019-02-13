package task17;

public class Library {
    public static void main(String[] args) {
        BookShelf bs1 = new BookShelf();

        Book b1 = new Book("Whisky");
        Author a1 = new Author("Jhon Walker");

        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1);
        bs1.addBook(b1, a1); // 11 redundant element in bookshelf

        bs1.showAllBooks();
    }
}
