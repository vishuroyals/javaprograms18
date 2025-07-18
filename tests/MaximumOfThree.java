package tests;

import java.util.Scanner;

public class MaximumOfThree {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Three Numbers: ");
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		int num3 = scr.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println("All numbers are equal: " + num1);
		} else if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is the Maximum");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the Maximum");
		} else {
			System.out.println(num3 + " is the Maximum");
		}
	}
}
