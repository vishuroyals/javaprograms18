package conditionalstatements;

import java.util.Scanner;

public class DivisibleByFive {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Number=");
		int n = scr.nextInt();
		if (n % 5 == 0) {
			System.out.println(n + " is divisible by 5....!");
		} else {
			System.out.println(n + " is not divisible by 5....!");
		}

	}
}
