package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;   // Binary: 0101
        int b = 3;   // Binary: 0011

        System.out.println("a & b  : " + (a & b));   // 1 (0001)
        System.out.println("a | b  : " + (a | b));   // 7 (0111)
        System.out.println("a ^ b  : " + (a ^ b));   // 6++- (0110)
        System.out.println("~a     : " + (~a));      // -6 (2's complement)
        System.out.println("a << 1 : " + (a << 1));  // 10 (1010)
        System.out.println("a >> 1 : " + (a >> 1));  // 2 (0010)
        System.out.println("a >>> 1: " + (a >>> 1)); // 2 (unsigned right shift)
    }
}
