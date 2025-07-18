package tests;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter a number:");
		int n = scr.nextInt();
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of the first " + n + " natural numbers: " + sum);

	}
}
