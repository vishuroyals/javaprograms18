package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
//function to sort the array
	static void sortArr(int arr[], int size) {
		int temp;
		// uses bubblesort to sort the Array
		for (int i = 0; i < size; i++) {
			// compared and replaces the element with all the remaining elements in array
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the array size:");// Asking user to give array size
		int size = scr.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < size; i++) { // Takes the element as input from the user
			arr[i] = scr.nextInt();
		}
		// prints the array before and after sorting(sortArr(arr,size))
		System.out.println("The array elements are:" + Arrays.toString(arr));
		// Sorting an array im increasing order by using Arrays.sort
		// function(Arrays.sort(arr))
		Arrays.sort(arr);
		System.out.println("The array elements after sorting in ascending order are:" + Arrays.toString(arr));
		scr.close();
	}

}
