package tcsnqt;

import java.util.Scanner;

public class DigitOrNumber {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a Integer:");
		int n = scr.nextInt();
		if(n>=-9 && n<=9 ) {
			System.out.println("Digit");
		} else {
			System.out.println("Number");
		}
	}
}
