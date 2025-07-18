package typecasting;

public class Student extends Perzon {
Student(){
	System.out.println("I'm a Student Class Constructor");
}
public static void main(String[] args) {
	//upCasting
	Perzon s1=new Student();
	//downCasting
	Student s2=(Student) new Perzon();
}
}
