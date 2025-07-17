package conditionalstatements;

import java.util.Scanner;

public class DivisibleBy2And3 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scr.nextInt();

		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println(num + " is divisible by both 2 and 3");
		}
		if (num % 2 == 0 || num % 3 == 0) {
            System.out.println(num + " is divisible by 2 or 3");
        } else {
			System.out.println(num + " is NOT divisible by both 2 and 3");
		}
	}
}
