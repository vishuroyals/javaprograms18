package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Creating list using the arraylist class
		List<Integer> numbers = new ArrayList<>();
		// Adding elements to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List: " + numbers);
		// Access elements from the list
		int number = numbers.get(2);
		System.out.println("Accessed Element:" + number);
		// Removing the Element from the list
		int removenumber = numbers.remove(1);
		System.out.println("Removed Elements:" + removenumber);

	}
}
