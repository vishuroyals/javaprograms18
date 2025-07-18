package multipleinheritance;

public class FaceBookAuthentication implements SocialMediaAuthentication {

	@Override
	public void Authenticate(String UserName, String Password) {
		System.out.println("Authentication for Username(" + UserName + ")via FaceBook");
		System.out.println("Authentication for Password(" + Password + ")via FaceBook");
		
	}

}
