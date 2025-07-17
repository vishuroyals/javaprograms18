package assessment;

public class Book {
	String Title;
	String Author;
	String PublicationYear;
	double price;

	public static void main(String[] args) {
		Book obj1 = new Book();
		obj1.Title = "Java Programming";
		obj1.Author = "James Gosling";
		obj1.PublicationYear = "1995";
		obj1.price = 499.99;
		System.out.println("Book Details");
		System.out.println("Title of the Book:" + obj1.Title);
		System.out.println("Author of the Book:" + obj1.Author);
		System.out.println("Publication Year of the Book:" + obj1.PublicationYear);
		System.out.println("Price of the Book:" + obj1.price);
	}
}
