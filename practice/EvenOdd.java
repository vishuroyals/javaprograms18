package practice;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Number=");
		int n = scr.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is an Even Number");
		} else {
			System.out.println(n + " is an Odd Number");
		}
		scr.close();
	}
}
