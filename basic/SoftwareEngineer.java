package basic;
public class SoftwareEngineer extends Engineer{
	@Override
	void Work() {
		System.out.println("Software Engineer Works.....!");
	}
public static void main(String[] args) {
	SoftwareEngineer SE1=new SoftwareEngineer();
	SE1.Work();
}
}
