package day1;

public class MovieTicketBooking {
	String Movie_Name;
	int Seat_Number;
	double Price;
	static String Cinemas;

	public static void main(String[] args) {
		MovieTicketBooking obj = new MovieTicketBooking();
		obj.Movie_Name = "Sanam Teri Kasam";
		obj.Seat_Number = 7;
		obj.Price = 140;
		MovieTicketBooking.Cinemas = "PVR";
		System.out.println("Movie Name=" + obj.Movie_Name);
		System.out.println("Seat_Number=" + obj.Seat_Number);
		System.out.println("Price=" + obj.Price);
		System.out.println("Cinemas=" + MovieTicketBooking.Cinemas);
	}

}
