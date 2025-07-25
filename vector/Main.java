package vector;

import java.util.Iterator;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
//		Vector<String> mammals = new Vector<>();
//		// Using the add() method
//		mammals.add("Dog");
//		mammals.add("Horse");
//		mammals.add("Cat");
//		// Using index numbers
//		mammals.add(2, "Cat");
//		System.out.println("Vector:" + mammals);
//		// Using addAll()
//		Vector<String> animals = new Vector<>();
//		animals.add("Crocodile");
//		animals.addAll(mammals);
//		System.out.println("New Vector:" + animals);
//Using get()
		Vector<String> animals = new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");
		// Using get()
		String element = animals.get(2);
		System.out.println("element at index 2:" + element);
		// Using iterator()
		Iterator<String> iterate = animals.iterator();
		System.out.print("Vector:");
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
	}
}
