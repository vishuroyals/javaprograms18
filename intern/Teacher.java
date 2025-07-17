package intern;

public class Teacher extends Person {
    private int teacherId;
    private double salary;

    public Teacher(String name, int age, String address, int teacherId, double salary) {
        super(name, age, address);
        this.teacherId = teacherId;
        this.salary = salary;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public double getSalary() { 
        return salary;
    }
}
