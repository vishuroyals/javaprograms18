package multipleinheritance;

public class GoogleAuthentication implements SocialMediaAuthentication {

	@Override
	public void Authenticate(String UserName, String Password) {
		System.out.println("Authentication for Username(" + UserName + ")via Googgle");
		System.out.println("Authentication for Password(" + Password + ")via Googgle");

	}

}
