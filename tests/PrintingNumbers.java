package tests;

import java.util.Scanner;

public class PrintingNumbers {
public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Number:");
		long n = scr.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " ");
		}
	}
}
