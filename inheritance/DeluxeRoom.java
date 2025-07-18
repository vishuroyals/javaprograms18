package inheritance;

public class DeluxeRoom extends Room {
	boolean hasMiniBar;

	public DeluxeRoom(int roomnum, String roomType, boolean hasMiniBar) {
		super(roomnum, roomType);
		// TODO Auto-generated constructor stub
		System.out.println("Deluxe Room Class Constrcutor");
		this.roomnum = roomnum;
		this.roomType = roomType;
		this.hasMiniBar = hasMiniBar;
	}

	void displayAll() {
		System.out.println("Room Number: " + this.roomnum);
		System.out.println("Room Type: " + this.roomType);
		System.out.println("Has Mini Bar: " + this.hasMiniBar);
	}

	public static void main(String[] args) {
		DeluxeRoom d = new DeluxeRoom(101, "Double Bedroom with Ac", false);
		d.displayAll();
	}
}
