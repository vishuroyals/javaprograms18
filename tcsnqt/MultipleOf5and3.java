package tcsnqt;

import java.util.Scanner;

public class MultipleOf5and3 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = scr.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is divisible by both 3 and 5.");
        } else {
            System.out.println(n + " is not divisible by both 3 and 5.");
        }

        System.out.println("Multiplication Table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
