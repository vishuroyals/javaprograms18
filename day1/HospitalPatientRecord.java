package day1;

public class HospitalPatientRecord {
	String Patient_Name;
	int Patient_Id;
	String Disease;
	static String Hospital_Name;

	public static void main(String[] args) {
		HospitalPatientRecord H1 = new HospitalPatientRecord();
		H1.Patient_Name = "XXX";
		H1.Patient_Id = 101;
		H1.Disease = "Fever";
		HospitalPatientRecord.Hospital_Name = "Sunshine";
		System.out.println("Patient Name=" + H1.Patient_Name);
		System.out.println("Patient Id=" + H1.Patient_Id);
		System.out.println("Disease=" + H1.Disease);
		System.out.println("Hospital Name=" + HospitalPatientRecord.Hospital_Name);
	}
}
