package inheritance;

public class Room {
	int roomnum;
	String roomType;

	public Room(int roomnum, String roomType) {
		System.out.println("Room Class Constructor ");
		this.roomnum = roomnum;
		this.roomType = roomType;
	}

	void diplayRoomDetails() {
		System.out.println("Room Number:" + this.roomnum);
		System.out.println("Room Type:" + this.roomType);
	}

	public static void main(String[] args) {
		Room r1 = new Room(101, "Double Bedroom with Ac");
		r1.diplayRoomDetails();
	}
}
