package task16;

public class Author {
    private String authorName = new String();
    private int authorYearBirth = 1900;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getAuthorYearBirth() {
        return authorYearBirth;
    }

    public void setAuthorYearBirth(int authorYearBirth) {
        this.authorYearBirth = authorYearBirth;
    }
}

//Класс Author должен содержать информацию о человеке написавшем книгу:
//имя и фамилия автора;
//год рождения;