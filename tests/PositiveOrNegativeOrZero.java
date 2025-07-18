package tests;

import java.util.Scanner;

public class PositiveOrNegativeOrZero {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any Integer:");
		int n = scr.nextInt();
		if (n > 0) {
			System.out.println(n + " is  Positive");
		} else if (n < 0) {
			System.out.println(n + "  is Negative");
		} else {
			System.out.println("Zero");
		}
	}
}
