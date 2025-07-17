package day1;

public class Hospital {
	String Hospital_Name;
	String City;
	int NumberOfBeds;

	public static void main(String[] args) {
		Hospital H1 = new Hospital();
		H1.Hospital_Name = "XXX";
		H1.City = "Anantapur";
		H1.NumberOfBeds = 3000;
		System.out.println("HospitalName:" + H1.Hospital_Name);
		System.out.println("City:" + H1.City);
		System.out.println("NumberOfBeds:" + H1.NumberOfBeds);
		System.out.println("----------------------------");
		Hospital H2 = new Hospital();
		H2.Hospital_Name = "XYZ";
		H2.City = "Kadapa";
		H2.NumberOfBeds = 4000;
		System.out.println("HospitalName:" + H2.Hospital_Name);
		System.out.println("City:" + H2.City);
		System.out.println("NumberOfBeds:" + H2.NumberOfBeds);
		System.out.println("----------------------------");
		Hospital H3 = new Hospital();
		H3.Hospital_Name = "XZY";
		H3.City = "Kurnool";
		H3.NumberOfBeds = 6000;
		System.out.println("HospitalName:" + H3.Hospital_Name);
		System.out.println("City:" + H3.City);
		System.out.println("NumberOfBeds:" + H3.NumberOfBeds);
		System.out.println("----------------------------");
		Hospital H4 = new Hospital();
		H4.Hospital_Name = "YZX";
		H4.City = "Vizag";
		H4.NumberOfBeds = 5000;
		System.out.println("HospitalName:" + H4.Hospital_Name);
		System.out.println("City:" + H4.City);
		System.out.println("NumberOfBeds:" + H4.NumberOfBeds);
		System.out.println("----------------------------");
		Hospital H5 = new Hospital();
		H5.Hospital_Name = "ZXY";
		H5.City = "Vijayawada";
		H5.NumberOfBeds = 10000;
		System.out.println("HospitalName:" + H5.Hospital_Name);
		System.out.println("City:" + H5.City);
		System.out.println("NumberOfBeds:" + H5.NumberOfBeds);

	}
}
