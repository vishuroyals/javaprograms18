package intern;

public class HospitalStaff {
    private String staffId;
    private String name;
    private String department;

    public HospitalStaff(String staffId, String name, String department) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() { 
        return department;
    }

    public void work() { 
        System.out.println(name + " is working in the hospital.");
    }
}
