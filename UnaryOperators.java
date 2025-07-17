package operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Initial value of a: " + a);

        System.out.println("Post-increment a++: " + (a++));  // Prints 5, then a becomes 6
        System.out.println("After post-increment, a: " + a); // 6

        System.out.println("Pre-increment ++a: " + (++a));  // a becomes 7, then prints 7

        System.out.println("Post-decrement a--: " + (a--));  // Prints 7, then a becomes 6
        System.out.println("After post-decrement, a: " + a); // 6

        System.out.println("Pre-decrement --a: " + (--a));   // a becomes 5, then prints 5

        boolean flag = false;
        System.out.println("Logical NOT !flag: " + (!flag)); // true
    }
}