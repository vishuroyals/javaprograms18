package assessment;

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
	}
}