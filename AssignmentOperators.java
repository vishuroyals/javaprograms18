package operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Initial value: " + a);

        a += 5;  // a = a + 5
        System.out.println("After a += 5: " + a);

        a -= 3;  // a = a - 3
        System.out.println("After a -= 3: " + a);

        a *= 2;  // a = a * 2
        System.out.println("After a *= 2: " + a);

        a /= 4;  // a = a / 4
        System.out.println("After a /= 4: " + a);

        a %= 3;  // a = a % 3
        System.out.println("After a %= 3: " + a);
    }
}