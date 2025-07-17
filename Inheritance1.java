package oops;

class Dog {
	void dog() {
		System.out.println("Barking");
	}
}

class Cat extends Dog {
	void cat() {
		System.out.println("Meow");
	}
}

class Snake extends Cat {
	void snake() {
		System.out.println("Biss");
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		Snake s1 = new Snake();
		s1.dog();
		s1.cat();
		s1.snake();

	}
}
