package conditionalstatements;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any year:");
		int year = scr.nextInt();
		if (year % 4 == 0) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}
		scr.close();
	}
}
