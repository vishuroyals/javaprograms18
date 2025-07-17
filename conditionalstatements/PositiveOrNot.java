package conditionalstatements;

import java.util.Scanner;

public class PositiveOrNot {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scr.nextInt();
		if (n > 0) {
		    System.out.println("Positive");
		} else if (n < 0) {
		    System.out.println("Negative");
		} else {
		    System.out.println("Zero");  // specifically for 0
		}

	}
}
