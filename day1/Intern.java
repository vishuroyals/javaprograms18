package day1;

public class Intern {
	String Candidate_Name;
	int Candidate_ID;
	long Mobile_num;
	static String Job_Role;

	public static void main(String[] args) {
		Intern i1 = new Intern();
		i1.Candidate_Name = "scoot";
		i1.Candidate_ID = 101;
		i1.Mobile_num = 123456789l;
		Job_Role="Java Full statck Developer";
		System.out.println("Candidate NAme :" + i1.Candidate_Name);
		System.out.println("Candidate Id :" + i1.Candidate_ID);
		System.out.println("MobileNumber :" + i1.Mobile_num);
		System.out.println("Job Role :" + Job_Role);
		System.out.println("--------------------------------------------------------------");
		Intern i2 = new Intern();
		i2.Candidate_Name = "smith";
		i2.Candidate_ID = 102;
		i2.Mobile_num = 923456789l;
		Job_Role="Java Full statck Developer";
		System.out.println("Candidate NAme :" + i2.Candidate_Name);
		System.out.println("Candidate Id :" + i2.Candidate_ID);
		System.out.println("MobileNumber :" + i2.Mobile_num);
		System.out.println("Job Role :" + Job_Role);

	}
}
