package arrays;

public class ForEachLoop {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 1, 30, 50, 7, 1, 0, 0 };
		System.out.print("The array elements are : ");

		for (int iter : arr) {
			System.out.print(iter + " ");
		}
	}
}
