package basic;

public class ElectricalEngineer extends Engineer{
	@Override
	void Work(){
		System.out.println("Electrical Engineer Works....!");
	}
public static void main(String[] args) {
	ElectricalEngineer e1=new ElectricalEngineer();
	e1.Work();
}
}
