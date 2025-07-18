package encapsulation;

public class Student {
    private int marks;
    private String name;
    private String sid;

    // Setter methods
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks Please enter between 0-100.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    // Getter methods
    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public String getSid() {
        return sid;
    }

    // Method to determine grade
    String getGrade() {
        if (marks > 90) return "A";
        else if (marks > 80 && marks <= 90) return "B";
        else if (marks > 70 && marks <= 80) return "C";
        else if (marks > 60 && marks <= 70) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setName("Swathi");
        obj1.setSid("18");
        obj1.setMarks(80);

        if (obj1.getMarks() >= 0 && obj1.getMarks() <= 100) {
            System.out.println("Valid Marks");
        } else {
            System.out.println("Invalid Marks");
        }

        System.out.println("Student Name: " + obj1.getName());
        System.out.println("Student Id: " + obj1.getSid());
        System.out.println("Student Marks: " + obj1.getMarks());
        System.out.println("Student Grade: " + obj1.getGrade());
    }
}
