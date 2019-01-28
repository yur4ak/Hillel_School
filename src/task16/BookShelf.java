package task16;

public class BookShelf {
    public static void main(String[] args) {
        Book firstBook = new Book();
        Author firstBookAuthor = new Author();
        firstBookAuthor.setAuthorName("Jonny Walker");
        firstBook.setAuthorName(firstBookAuthor.getAuthorName());
        System.out.println(firstBook.getAuthorName());
    }
}
