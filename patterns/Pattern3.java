package patterns;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the value for the n:");
		int n = scr.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
		scr.close();
	}
}
