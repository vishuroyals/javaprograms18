package operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 55, b = 10;

        int max = (a > b) ? a : b;

        System.out.println("Maximum value is: " + max);
    }
}