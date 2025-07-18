package inheritance;

public class LibraryBook extends Book {
	String ISBN;

	public LibraryBook(String title, String author, String ISBN) {
		super(title, author);
		this.ISBN = ISBN;
		// TODO Auto-generated constructor stub
		System.out.println("Libraby Book Class Constructor");
	}

	void displayAll() {
		System.out.println("Title:" + this.title);
		System.out.println("Author:" + this.author);
		System.out.println("ISBN:" + this.ISBN);
	}

	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook("XYZ", "Scott", "1234567890");
		b1.displayAll();
	}

}
