package intern;

class Ticket {
	private String ticketNumber;
	private String passengerName;
	private double price;

	public Ticket(String ticketNumber, String passengerName, double price) {
		this.ticketNumber = ticketNumber;
		this.passengerName = passengerName;
		this.price = price;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public double getPrice() {
		return price;
	}

	public double calculateFinalPrice(int extraBaggage) {
		return price;
	}

	public void displayTicketInfo() {
		System.out.println("Ticket Number: " + ticketNumber);
		System.out.println("Passenger Name: " + passengerName);
		System.out.println("Base Price: ₹" + price);
	}
}

class EconomyClass extends Ticket {
	private final int baggageAllowance = 15;

	public EconomyClass(String ticketNumber, String passengerName, double price) {
		super(ticketNumber, passengerName, price);
	}

	@Override
	public double calculateFinalPrice(int extraBaggage) {
		double extraCharge = (extraBaggage > baggageAllowance) ? (extraBaggage - baggageAllowance) * 500 : 0;
		return getPrice() + extraCharge;
	}

	@Override
	public void displayTicketInfo() {
		super.displayTicketInfo();
		System.out.println("Class: Economy");
		System.out.println("Baggage Allowance: " + baggageAllowance + "kg");
	}
}

class BusinessClass extends Ticket {
	private final int baggageAllowance = 30;

	public BusinessClass(String ticketNumber, String passengerName, double price) {
		super(ticketNumber, passengerName, price);
	}

	@Override
	public double calculateFinalPrice(int extraBaggage) {
		double extraCharge = (extraBaggage > baggageAllowance) ? (extraBaggage - baggageAllowance) * 300 : 0;
		return getPrice() + extraCharge;
	}

	@Override
	public void displayTicketInfo() {
		super.displayTicketInfo();
		System.out.println("Class: Business");
		System.out.println("Baggage Allowance: " + baggageAllowance + "kg");
	}
}

public class AirlineTicketSystem {
	public static void main(String[] args) {
		Ticket economyTicket = new EconomyClass("E123", "John Doe", 5000);
		Ticket businessTicket = new BusinessClass("B456", "Alice Smith", 12000);

		int extraBaggageEconomy = 20; // 5kg extra
		int extraBaggageBusiness = 35; // 5kg extra

		System.out.println("Economy Ticket Details:");
		economyTicket.displayTicketInfo();
		System.out
				.println("Final Price with Extra Baggage: ₹" + economyTicket.calculateFinalPrice(extraBaggageEconomy));
		System.out.println();
		System.out.println("**********************************");
		System.out.println("Business Ticket Details:");
		businessTicket.displayTicketInfo();
		System.out.println(
				"Final Price with Extra Baggage: ₹" + businessTicket.calculateFinalPrice(extraBaggageBusiness));
	}
}