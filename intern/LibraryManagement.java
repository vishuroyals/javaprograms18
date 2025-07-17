package intern;

public class LibraryManagement {
	public static void main(String[] args) {
		Book1 obj = new Book1("Java", "James Gosling", "9iuygfdswe3456789", "101", "Scott", 5);

		System.out.println("Book Details:");
		System.out.println("Title: " + obj.getTitle());
		System.out.println("Author: " + obj.getAuthor());
		System.out.println("ISBN: " + obj.getIsbn());

		obj.borrowBook();
		obj.returnBook();
		obj.returnBook();
		obj.returnBook();
		obj.returnBook();
	}
}
