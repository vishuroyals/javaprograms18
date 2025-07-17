package day1;

public class Train {
	int TrainNumber;
	String TrainName;
	String Destination;

	public static void main(String[] args) {
		Train T1 = new Train();
		T1.TrainNumber = 7890;
		T1.TrainName = "PrasanthiExpress";
		T1.Destination = "HYD TO ATP";
		System.out.println("TrainNumber:" + T1.TrainNumber);
		System.out.println("TrainName:" + T1.TrainName);
		System.out.println("Destination:" + T1.Destination);
		System.out.println("-------------------------------------------");
		Train T2 = new Train();
		T2.TrainNumber = 7890;
		T2.TrainName = "One Day Bharat";
		T2.Destination = "ATP TO TTD";
		System.out.println("TrainNumber:" + T2.TrainNumber);
		System.out.println("TrainName:" + T2.TrainName);
		System.out.println("Destination:" + T2.Destination);
		System.out.println("-------------------------------------------");
		Train T3 = new Train();
		T3.TrainNumber = 7890;
		T3.TrainName = "Kachiguda Express";
		T3.Destination = "HYD TO ODISHA";
		System.out.println("TrainNumber:" + T3.TrainNumber);
		System.out.println("TrainName:" + T3.TrainName);
		System.out.println("Destination:" + T3.Destination);
	}
}
