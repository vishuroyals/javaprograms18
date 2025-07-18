package tests;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.print("Enter marks: ");
		int marks = scr.nextInt();

		if (marks < 0 || marks > 100) {
			System.out.println("Marks should be between 0 and 100.");
		} else if (marks >= 90) {
			System.out.println("90–100: A");
		} else if (marks >= 75) {
			System.out.println("75–89: B");
		} else if (marks >= 50) {
			System.out.println("50–74: C");
		} else if (marks >= 35) {
			System.out.println("35–49: D");
		} else {
			System.out.println("Below 35: F");
		}

		scr.close();
	}
}
