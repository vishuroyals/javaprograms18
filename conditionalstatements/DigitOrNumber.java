package conditionalstatements;

import java.util.Scanner;

public class DigitOrNumber {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any number=");
		int num = scr.nextInt();
//		if (num >= -9 && num <= 9) {
//			System.out.println(num + " is a digit.........");
//		} else {
//			System.out.println(num + " is a number....... ");
//		}

		String output = (num >= -9 && num <= 9) ? "Digit" : "Number";
		System.out.println(num + " is " + output);

	}
}
