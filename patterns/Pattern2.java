package patterns;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scr.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j =1; j <= n-1 ; j++) {
				System.out.print(i + "");
			}
			System.out.println();
		}
	}
}
