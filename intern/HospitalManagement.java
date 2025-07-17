package intern;

public class HospitalManagement {
	public static void main(String[] args) {
		HospitalStaff doctor = new Doctor("D101", "Dr. Smith", "Cardiology");
		HospitalStaff nurse = new Nurse("N202", "Nurse Emily", "Pediatrics");

		// Polymorphism
		System.out.println("Hospital Staff Details:\n");

		doctor.work(); // Calls Doctor's work()
		((Doctor) doctor).diagnosePatient(); // Specific to Doctor

		System.out.println();

		nurse.work(); // Calling Nurse's work()
		((Nurse) nurse).assistDoctor(); // Specific to Nurse
	}
}
