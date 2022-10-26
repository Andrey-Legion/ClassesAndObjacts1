public class Book {
    private final String title;
    private final Author authorName;
    public int yearPublishing;
    public   Book(String title, Author authorName, int yearPublishing) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        if (yearPublishing>2023){
            System.out.println("Неправильно введённый год издания " + yearPublishing);
            return;
        }
        this.yearPublishing=yearPublishing;
    }
}
