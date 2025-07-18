package vector;

import java.util.Vector;

public class RemovingVector {
	public static void main(String[] args) {
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");
		System.out.println("Initial vector:" + animals);
		// Using remove()
		String element = animals.remove(1);
		System.out.println("Removed Elements:" + element);
		System.out.println("New Vector:" + animals);
		// Using Clear()
		animals.clear();
		System.out.println("Vector after clear():" + animals);
	}
}
