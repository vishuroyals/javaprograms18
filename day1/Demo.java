package day1;

public class Demo {
 int Num_Varibale=18;
 final int Num_Constant=10;
 public static void main(String[] args) {
	Demo ObjRef=new Demo();
	System.out.println("Num_Varibale:"+ObjRef.Num_Varibale);
	System.out.println("Num_Constant:"+ObjRef.Num_Constant);
	System.out.println("After Modification:");
	ObjRef.Num_Varibale=10;
	System.out.println("Num_Varibale:"+ObjRef.Num_Varibale);
}
}
