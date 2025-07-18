package stack;

import java.util.Stack;

public class SearchMehod {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		// Add elements to stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println("Stack:" + animals);
		// Search an element
		int position = animals.search("Horse");
		System.out.println("Postiton of Horse:" + position);
	}
}
