package tests;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int factorial = 1;
		System.out.println("Enter a Number:");
		int n = scr.nextInt();
		for (int i = 1; i <=n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of" + n + "is:" + factorial);
	}
}
