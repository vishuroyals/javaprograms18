package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a > 5 && b > 15 : " + (a > 5 && b > 15));   // true
        System.out.println("a > 15 || b > 15 : " + (a > 15 || b > 15)); // true
        System.out.println("!(a > 5) : " + !(a > 5));                   // false
    }
}
