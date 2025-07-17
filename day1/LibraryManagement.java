package day1;

public class LibraryManagement {
	String Title;
	String Author;
	long Isbn;
	static String City;

	public static void main(String[] args) {
		LibraryManagement L1 = new LibraryManagement();
		L1.Title = "The Kingdom";
		L1.Author = "scott";
		L1.Isbn = 234567890l;
		City = "XXXXX";
		System.out.println("Title=" + L1.Title);
		System.out.println("Author=" + L1.Author);
		System.out.println("ISbn=" + L1.Isbn);
		System.out.println("City=" + LibraryManagement.City);
	}
}
