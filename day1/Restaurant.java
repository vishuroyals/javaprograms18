package day1;

public class Restaurant {
	String Restaurant_Name;
	String Cuisine_Type;
	int rating;

	public static void main(String[] args) {
		Restaurant R1 = new Restaurant();
		R1.Restaurant_Name = "GoldenTaj";
		R1.Cuisine_Type = "Italin";
		R1.rating = 7;
		System.out.println("RestaurantName:" + R1.Restaurant_Name);
		System.out.println("CuisineType:" + R1.Cuisine_Type);
		System.out.println("Ratings:" + R1.rating);
		System.out.println("----------------------------------------------------------------");
		Restaurant R2 = new Restaurant();
		R2.Restaurant_Name = "Exotika";
		R2.Cuisine_Type = "Indian";
		R2.rating = 6;
		System.out.println("RestaurantName:" + R2.Restaurant_Name);
		System.out.println("CuisineType:" + R2.Cuisine_Type);
		System.out.println("Ratings:" + R2.rating);
		System.out.println("----------------------------------------------------------------");
		Restaurant R3 = new Restaurant();
		R3.Restaurant_Name = "PistaHouse";
		R3.Cuisine_Type = "Mexico";
		R3.rating = 8;
		System.out.println("RestaurantName:" + R3.Restaurant_Name);
		System.out.println("CuisineType:" + R3.Cuisine_Type);
		System.out.println("Ratings:" + R3.rating);

	}
}
