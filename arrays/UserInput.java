package arrays;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size = scr.nextInt();
		int num_arr[] = new int[size];
		// initializing the array
		for (int i = 0; i < size; i++) {
			System.out.println("Enter a Element:");
			num_arr[i] = scr.nextInt();

		}
		// acessing the elements
		System.out.println("Entered Array  Elements are:");
		for (int i = 0; i < size; i++) {
			System.out.print(num_arr[i] + " ");

		}
	}
}
