package conditionalstatements;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any integer:");
		int num = scr.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " is Even");
		}
	}
}
