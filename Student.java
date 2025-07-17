package variables;


public class Student {
    int rollNo; // instance variable
    static String college = "JNTUA"; // static variable 

    void display() {
        System.out.println(rollNo + " - " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;

        Student s2 = new Student();
        s2.rollNo = 2;

        s1.display();  // 1 - JNTUA
        s2.display();  // 2 - JNTUA
    }
}
