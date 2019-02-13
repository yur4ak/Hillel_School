package task17;

public class BookShelf {

    private String[] arrBooks = new String[11];
    private int counter = 0;

    public void addBook(Book book, Author author){
        if(counter < 10) {
            arrBooks[counter] = (book.getBookTitle() + " - " + author.getAuthorName());
            counter++;
        } else arrBooks[counter] = "Sorry bookshelf is full";
    }

    public void showAllBooks(){
        for (int i = 0; i < arrBooks.length-1; i++) {
            System.out.println(arrBooks[i]);
        }
        if (arrBooks[arrBooks.length-1] != null){
            System.out.println(arrBooks[arrBooks.length-1]);
        }
    }

}
