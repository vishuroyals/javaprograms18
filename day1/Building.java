package day1;

public class Building {
	String Building_Name;
	int Height;
	int NumberOfFloors;

	public static void main(String[] args) {
		Building B1 = new Building();
		B1.Building_Name = "AAAAA";
		B1.Height = 120;
		B1.NumberOfFloors = 2;
		System.out.println("BuildingName=" + B1.Building_Name);
		System.out.println("Height=" + B1.Height);
		System.out.println("NumberOfFloors=" + B1.NumberOfFloors);
		System.out.println("-------------------------------------");
		Building B2 = new Building();
		B2.Building_Name = "CCCCC";
		B2.Height = 150;
		B2.NumberOfFloors = 4;
		System.out.println("BuildingName=" + B2.Building_Name);
		System.out.println("Height=" + B2.Height);
		System.out.println("NumberOfFloors=" + B2.NumberOfFloors);
		System.out.println("-------------------------------------");
		Building B3 = new Building();
		B3.Building_Name = "BBBB";
		B3.Height = 180;
		B3.NumberOfFloors = 6;
		System.out.println("BuildingName=" + B3.Building_Name);
		System.out.println("Height=" + B3.Height);
		System.out.println("NumberOfFloors=" + B3.NumberOfFloors);
		System.out.println("-------------------------------------");

	}
}
