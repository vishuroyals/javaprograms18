package conditionalstatements;

import java.util.Scanner;

public class DivisibleBy3and5 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = scr.nextInt();

		if (num % 3 == 0 || num % 5 == 0) {
			System.out.println(num + " is divisible by 3 or 5");
		} else {
			System.out.println(num + " is not divisible by 3 or 5");
		}
	}
}