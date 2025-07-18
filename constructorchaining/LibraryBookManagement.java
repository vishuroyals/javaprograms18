package constructorchaining;

public class LibraryBookManagement {
	String bookTitle;
	String Author;
	String ISBN;
	double Price;

	public LibraryBookManagement() {
		System.out.println("New Book Entry Created");
	}

	public LibraryBookManagement(String bookTitle) {
		this.bookTitle = bookTitle;
		System.out.println("Book " + bookTitle + " has been Created ");
	}

	public LibraryBookManagement(String bookTitle, String Author) {
		this.bookTitle = bookTitle;
		this.Author = Author;
		System.out.println("Book " + bookTitle + " by " + Author + " has been Added");

	}

	public static void main(String[] args) {
		LibraryBookManagement l1 = new LibraryBookManagement();
		LibraryBookManagement l2 = new LibraryBookManagement("RadhaKrishna");
		LibraryBookManagement l3 = new LibraryBookManagement("RadhaKrishna", "Krishna");

	}
}
