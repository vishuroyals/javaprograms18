package multipleinheritance;

public class SocialMediaLogin {
	public static void main(String[] args) {
		GoogleAuthentication obj = new GoogleAuthentication();
		obj.Authenticate("Scott", "Tiger");
		System.out.println("-----------------------------------------------------------");
		FaceBookAuthentication obj1 = new FaceBookAuthentication();
		obj1.Authenticate("Smith", "Lion");
	}
}
