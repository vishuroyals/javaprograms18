package intern;
public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String t, String a, String i) {
        this.title = t;
        this.author = a;
        this.isbn = i;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
