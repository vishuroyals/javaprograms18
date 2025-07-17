package assessment;

public class Planet {
	String name;
	int distanceFromSun;
	int diameter;

	public static void main(String[] args) {
		Planet obj = new Planet();
		obj.name = "Earth";
		obj.distanceFromSun = 150;
		obj.diameter = 12742;
		System.out.println("Planet Details ");
		System.out.println("Planet Name: " + obj.name);
		System.out.println("Distance from Sun: " + obj.distanceFromSun + " million km");
		System.out.println("Diameter: " + obj.diameter + " km");

	}
}
