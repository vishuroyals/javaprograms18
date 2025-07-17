package superkeyword;

public class Iphone10Pro extends Iphone10 {
void supportFor5GNetwork() {
	System.out.println("5G Network support..........");
}
public static void main(String[] args) {
	Iphone10Pro obj=new Iphone10Pro();
	obj.makeCalls();
	obj.unlockPhoneByFaceId();
	obj.supportFor5GNetwork();
}
}
