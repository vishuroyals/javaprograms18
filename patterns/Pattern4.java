package patterns;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scr.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
