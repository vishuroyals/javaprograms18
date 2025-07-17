package intern;


public class Student1 extends Person {
    private int studentId;
    private String grade;

    public Student1(String name, int age, String address, int studentId, String grade) {
        super(name, age, address);
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getGrade() { 
        return grade;
    }
}
