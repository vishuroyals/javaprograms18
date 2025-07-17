package day1;

public class School {
	String School_Name;
	String Location;
	int Number_of_Students;

	public static void main(String[] args) {
		School S1 = new School();
		S1.School_Name = "Narayana";
		S1.Location = "IND";
		S1.Number_of_Students = 5000;
		System.out.println("SchoolName:" + S1.School_Name);
		System.out.println("Location:" + S1.Location);
		System.out.println("Number of Student:" + S1.Number_of_Students);
		System.out.println("-----------------------------------------------");
		School S2 = new School();
		S2.School_Name = "XXXX";
		S2.Location = "USA";
		S2.Number_of_Students = 8000;
		System.out.println("SchoolName:" + S2.School_Name);
		System.out.println("Location:" + S2.Location);
		System.out.println("Number of Student:" + S2.Number_of_Students);
		System.out.println("-----------------------------------------------");
		School S3 = new School();
		S3.School_Name = "YYYY";
		S3.Location = "UK";
		S3.Number_of_Students = 7000;
		System.out.println("SchoolName:" + S3.School_Name);
		System.out.println("Location:" + S3.Location);
		System.out.println("Number of Student:" + S3.Number_of_Students);
	}

}
