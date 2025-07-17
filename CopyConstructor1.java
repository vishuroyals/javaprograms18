package oops;

class Duplicate {
	String book_name;
	String book_author;

	// Parameterised Constructor
	Duplicate(String name, String author) {
		this.book_name = name;
		this.book_author = author;
	}

	// CopyConstructor
	Duplicate(Duplicate c) {
		this.book_name = c.book_name;
		this.book_author = c.book_author;

	}

	void display() {
		System.out.println("Book Name is:" + this.book_name);
		System.out.println("Book Author Name is :" + this.book_author);
	}
}

public class CopyConstructor1 {
	public static void main(String[] args) {
		Duplicate d1 = new Duplicate("XYZ", "ASDFG");
		d1.display();
		Duplicate d2 = new Duplicate(d1);
		d2.display();

	}

}
