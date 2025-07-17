package basic;

public class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("Dog is eating food");
	}

	void bark() {
		System.out.println("Dog can Bark");
	}
	public static void main(String[] args) {
		Dog  d=new Dog ();
		d.eat();
		d.bark();
	}
}
