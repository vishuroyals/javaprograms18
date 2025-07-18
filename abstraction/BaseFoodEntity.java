package abstraction;

public abstract class BaseFoodEntity implements FoodEntity {
	String name;
	int id;

	public BaseFoodEntity(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public abstract void displayDetails();
}
