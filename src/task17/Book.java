package task17;

public class Book {
    public Author author;
    //private String authorName;
    private int numPages = 0;
    private String authorBio;
    private String title;

    public Book(String nameAuthor, int numPages, String title){
         //   this.author = new Author(nameAuthor);
            this.numPages = numPages;
    }


//    public String getAuthorName() {
//        return authorName;
//    }
//
//    public void setAuthorName(String authorName) {
//        this.authorName = authorName;
//    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthorBio() {
        return authorBio;
    }

    public void setAuthorBio(String authorBio) {
        this.authorBio = authorBio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
