package tests;

import java.util.Scanner;

public class Amount {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Amount:");
		long amount = scr.nextLong();
		System.out.println("2000rs notes--------->:" + amount % 2000);
		System.out.println("500rs notes--------->:" + amount % 500);
		System.out.println("200rs notes---------->:" + amount % 200);
		System.out.println("100rs notes---------->:" + amount % 100);
		System.out.println("50rs notes----------->:" + amount % 50);
		System.out.println("20rs notes------------>:" + amount % 20);
		System.out.println("10rs coins/notes------------>:" + amount % 10);
		System.out.println("5rs coins------------->:" + amount % 5);
		System.out.println("2rs coins------------->:" + amount % 2);
		System.out.println("1rs coins------------->:" + amount % 1);

	}
}
