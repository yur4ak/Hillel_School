package task17;

public class BookShelf {
    private Book[] arrBooks;
    private int counter = 0;

    public BookShelf(int lenght){
        this.arrBooks = new Book[lenght];
    }

    public void put(Book book) {
        if (counter < arrBooks.length) {
            arrBooks[counter++] = book;
        } else {
            System.out.println("Bookshelf is filled up");

        }
    }

    public void showAllBooks() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Book: " + arrBooks[i]);
        }

    }
}
