package abstraction;

public class Restaurant extends BaseFoodEntity {
    String location;

    public Restaurant(String name, int id, String location) {
        super(name, id);
        this.location = location;
    }

    @Override
    public void displayDetails() {
        System.out.println("Restaurant Name: " + this.name);
        System.out.println("Restaurant ID: " + this.id);
        System.out.println("Location: " + this.location);
        System.out.println("------------------------------");
    }
}
