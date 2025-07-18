package stack;

import java.util.Stack;

public class EmptyMethod { 
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		// Add elements to stack
//		animals.push("Dog");
//		animals.push("Horse");
//		animals.push("Cat");
		System.out.println("Stack:" + animals);
		// check if stack is empty
		boolean result = animals.empty();
		System.out.println("Is the stack empty?" + result);
	}
}
