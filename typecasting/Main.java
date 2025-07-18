package typecasting;
class Father{
	void work() {
		System.out.println("Earning Father");
	}
}
class Son extends Father{
	void play() {
		System.out.println("Enjoying Son");
	}
}
public class Main {
public static void main(String[] args) {
//	DownCasting
	Father father;
	father=new Son();
	Son son=(Son)father();
}

private static Son father() {
	// TODO Auto-generated method stub
	return null;
}
}
