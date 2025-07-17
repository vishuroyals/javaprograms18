package assessment;

public class Building {
	String BuildingName;
	int height;
	int numberoffloors;

	public static void main(String[] args) {
		Building obj = new Building();
		obj.BuildingName = "Empire State Building";
		obj.height = 443;
		obj.numberoffloors = 102;
		System.out.println("Building Details");
		System.out.println("Building Name: " + obj.BuildingName);
		System.out.println("Height: " + obj.height + " meters");
		System.out.println("Number of Floors: " + obj.numberoffloors);

	}
}
