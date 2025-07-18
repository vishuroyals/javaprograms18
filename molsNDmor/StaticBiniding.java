package molsNDmor;

public class StaticBiniding {
	public static void main(String[] args) {
		Addition obj = new Addition();
		obj.add(10, 20);
		obj.add(10, 20, 30);
	}
}
