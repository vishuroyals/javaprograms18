package superkeyword;

public class Child extends Parent {
Child(){
this.fun();
super.fun();

}
void fun() {
	System.out.println("Child's functionality.............");
}
}
