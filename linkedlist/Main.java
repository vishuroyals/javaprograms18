package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Creating list using linkedlist class
		List<Integer> numbers = new LinkedList<>();
		// Add elements to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("List:" + numbers);
	}
}
