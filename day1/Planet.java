package day1;

public class Planet {
	String Planet_Name;
	float Distance_from_sun;
	int Diameter;

	public static void main(String[] args) {
		Planet P1 = new Planet();
		P1.Planet_Name = "Earth";
		P1.Distance_from_sun = 1.00f;
		P1.Diameter = 12786;
		System.out.println("PlanetName=" + P1.Planet_Name);
		System.out.println("DistanceFromSun=" + P1.Distance_from_sun);
		System.out.println("Diameter=" + P1.Diameter);
		System.out.println("-----------------------------");
		Planet P2 = new Planet();
		P2.Planet_Name = "Saturn";
		P2.Distance_from_sun = 9.85f;
		P2.Diameter = 120538;
		System.out.println("PlanetName=" + P2.Planet_Name);
		System.out.println("DistanceFromSun=" + P2.Distance_from_sun);
		System.out.println("Diameter=" + P2.Diameter);
		System.out.println("-----------------------------");
		Planet P3 = new Planet();
		P3.Planet_Name = "Mars";
		P3.Distance_from_sun = 1.56f;
		P3.Diameter = 6789;
		System.out.println("PlanetName=" + P3.Planet_Name);
		System.out.println("DistanceFromSun=" + P3.Distance_from_sun);
		System.out.println("Diameter=" + P3.Diameter);

	}
}
