package intern;

public class Doctor extends HospitalStaff {

    public Doctor(String staffId, String name, String department) {
        super(staffId, name, department);
    }

    public void diagnosePatient() {
        System.out.println(getName() + " is diagnosing a patient.");
    }

    @Override
    public void work() {  
        System.out.println(getName() + " Doctor is treating patients in the " + getDepartment() + " department.");
    }
}