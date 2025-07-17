package conditionalstatements;

import java.util.Scanner;

public class MonthValid {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a month:");
		int month = scr.nextInt();
		if (month >= 1 && month <= 12) {
			System.out.println("Valid Month:" + month);
		} else {
			System.out.println("Invalid Month:" + month);
		}
	}
}
