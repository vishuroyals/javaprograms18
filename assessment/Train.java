package assessment;

public class Train {
	int TrainNumber;
	String TrainName;
	String Destination;

	public static void main(String[] args) {
		Train obj = new Train();
		obj.TrainNumber = 12627;
		obj.TrainName = "Karnataka Express";
		obj.Destination = "New Delhi";
		System.out.println("Train Details");
		System.out.println("TrainNumber:" + obj.TrainNumber);
		System.out.println("TrainName:" + obj.TrainName);
		System.out.println("Destination:" + obj.Destination);

	}
}
