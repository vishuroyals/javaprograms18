package day1;

public class Book {
	String Title;
	String Author;
	String PublicationYear;
	int price;

	public static void main(String[] args) {
		Book B1 = new Book();
		B1.Title = "The gita Wisdom";
		B1.Author = "Krishna";
		B1.PublicationYear = "12-JAN-2020";
		B1.price = 456789;
		System.out.println("BookName:" + B1.Title);
		System.out.println("BookNum:" + B1.Author);
		System.out.println("Publicationyear:" + B1.PublicationYear);
		System.out.println("Price:" + B1.price);
		System.out.println("-----------------------------------------");
		Book B3 = new Book();
		B3.Title = "HarryPoptter";
		B3.Author = "XXX";
		B3.PublicationYear = "01-DEC-2022";
		B3.price = 1234;
		System.out.println("BookName:" + B3.Title);
		System.out.println("BookNum:" + B3.Author);
		System.out.println("PublicationYear:" + B3.PublicationYear);
		System.out.println("Price:" + B3.price);

	}
}
