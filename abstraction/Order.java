package abstraction;

public class Order extends BaseFoodEntity {
    int orderTotal;

    public Order(String name, int id, int orderTotal) {
        super(name, id);
        this.orderTotal = orderTotal;
    }

    @Override
    public void displayDetails() {
        System.out.println("Order ID: " + this.id);
        System.out.println("Customer Name: " + this.name);
        System.out.println("Order Total Amount: $" + this.orderTotal);
        System.out.println("------------------------------");
    }
}
