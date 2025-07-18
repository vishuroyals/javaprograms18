package inheritance;

public class Book {
	String title;
	String author;

	public Book(String title, String author) {
		System.out.println("Book Class Constructor");
		this.title = title;
		this.author = author;
	}

	void displayBookDetails() {
		System.out.println("Title:" + this.title);
		System.out.println("Author:" + this.author);
	}

	public static void main(String[] args) {
		Book b = new Book("XYZ", "Scott");
		b.displayBookDetails();
	}
}
