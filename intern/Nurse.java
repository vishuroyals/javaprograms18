package intern;

public class Nurse extends HospitalStaff {

    public Nurse(String staffId, String name, String department) {
        super(staffId, name, department);
    }

    public void assistDoctor() {
        System.out.println(getName() + " is assisting the doctor.");
    }

    @Override
    public void work() {  
        System.out.println(getName() + " Nurse is helping patients in the " + getDepartment() + " department.");
    }
}