package stack;

import java.util.Stack;

public class PushMethod {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		// Add Elements to stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println("Stack:" + animals);
	}
}
