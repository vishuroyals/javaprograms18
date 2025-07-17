package tests;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter an integer to print its multiplication table:");
		int n = scr.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

}
