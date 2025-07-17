package assessment;

public class Hospital {
	String HospitalName;
	String City;
	int NumberOfBeds;

	public static void main(String[] args) {
		Hospital obj = new Hospital();
		obj.HospitalName = "Apollo Hospital";
		obj.City = "Hyderabad";
		obj.NumberOfBeds = 250;
		System.out.println("Hospital Details");
		System.out.println("Hospital Name:" + obj.HospitalName);
		System.out.println("City:" + obj.City);
		System.out.println("Number of Beds:" + obj.NumberOfBeds);
	}

}
