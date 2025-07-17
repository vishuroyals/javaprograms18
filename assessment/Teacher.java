package assessment;

public class Teacher {
int teacherid;
String teacherName;
String Subject;
public static void main(String[] args) {
	Teacher obj=new Teacher();
	obj.teacherid = 101;
    obj.teacherName = "Ms.Rakshitha";
    obj.Subject = "Mathematics";
    System.out.println("Teacher ID: " + obj.teacherid);
    System.out.println("Teacher Name: " + obj.teacherName);
    System.out.println("Subject: " + obj.Subject);
}
}
