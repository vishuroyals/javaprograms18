package intern;

public class Book1 extends Book {
	private String memberId;
	private String name;
	private int borrowedBooks;

	public Book1(String t, String a, String i, String me, String na, int bor) {
		super(t, a, i);
		this.memberId = me;
		this.name = na;
		this.borrowedBooks = bor;
	}
	void borrowBook() {
		if (borrowedBooks < 5) {
			borrowedBooks++;
			System.out.println(name + " borrowed a book and Total borrowed: " + borrowedBooks);
		} else {
			System.out.println("Limit exceeded! Cannot borrow more than 5 books.");
		}
	}

	void returnBook() {
		if (borrowedBooks > 0) {
			borrowedBooks--;
			System.out.println(name + " returned a book. Books left: " + borrowedBooks);
		} else {
			System.out.println("No books to return!");
		}
	}
}
