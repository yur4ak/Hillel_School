package task16;

public class Book {
    private String bookName = new String();
    private int pagesAmount = 0;
    private String authorName = new String();

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}

//Спроектируйте и создайте классы Book, Author.
//Класс Book должен содержать минимальный набор полей:
//название книги;
//кол-во страниц;
//информацию об авторе книги.
//
//Класс Author должен содержать информацию о человеке написавшем книгу:
//имя и фамилия автора;
//год рождения;