package stringsbasic;

public class StringExample14 {
    public static void main(String[] args) {
        String name = "Swathi";
        name.concat(" Golla"); // Doesn't change original string
        System.out.println("After concat: " + name); // Still "Swathi"

        name = name.concat(" Golla"); // Now reassigned
        System.out.println("After reassignment: " + name); // Now "Swathi Golla"
    }
}
