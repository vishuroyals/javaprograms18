package day1;

public class AirlineReservationSystem {
	String Passenger_Name;
	long Ticket_Number;
	String Seat_Class;
	static String Airline_Name;

	public static void main(String[] args) {
		AirlineReservationSystem A1 = new AirlineReservationSystem();
		A1.Passenger_Name = "Rohith";
		A1.Ticket_Number = 10021;
		A1.Seat_Class = "Sleeper";
		AirlineReservationSystem.Airline_Name = "Sky Airlines";
		System.out.println("Passenger Name=" + A1.Passenger_Name);
		System.out.println("Ticket Number=" + A1.Ticket_Number);
		System.out.println("Seat Class=" + A1.Seat_Class);
		System.out.println("Airline Name=" + AirlineReservationSystem.Airline_Name);
	}
}
