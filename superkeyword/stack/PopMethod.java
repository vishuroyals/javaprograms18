package stack;
import java.util.Stack;
public class PopMethod {
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		// Add elements to stack
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println("Initiak Stack:" + animals);
		// Remove elements stacks
		String element = animals.pop();
		System.out.println("Removed Elements:" + element);
	}
}
