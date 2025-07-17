package methodoverloading;

public class TravelTicketBooking {
	void bookTicket() {
		System.out.println("Travel Agency allows booking tickets in different ways");
	}

	void bookTicket(String s, String k) {
		System.out.println("Accept Passenger's Name and date for Standard Booking");
	}

	void bookTicket(String a, String b, String c) {
		System.out.println("Showed the Reserved Seat Booking");
	}

	void bookTicket(String a, String b, String c, double d) {
		System.out.println("Additional Baggage Allowance Booking");
	}

	public static void main(String[] args) {
		TravelTicketBooking a = new TravelTicketBooking();
		a.bookTicket();
		a.bookTicket("Scott", "sdfghjkl");
		a.bookTicket("Smith", "asdfghjkl", "poiuytrewq");
		a.bookTicket("asdfghjkloiuyt", "poiuytredcv", "zxcvbnm", 0324);

	}
}
