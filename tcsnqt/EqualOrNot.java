package tcsnqt;

import java.util.Scanner;

public class EqualOrNot {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter value for num1=");
		int num1 = scr.nextInt();
		System.out.println("Enter value for num2=");
		int num2 = scr.nextInt();
		if (num1 == num2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
