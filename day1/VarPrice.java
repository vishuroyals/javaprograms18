package day1;

public class VarPrice {
	float Var_Price = 100.50f;

	public static void main(String[] args) {
		VarPrice V1 = new VarPrice();
		System.out.println("Price:" + V1.Var_Price);
		V1.Var_Price = 150.75f;
		System.out.println("After Modification:" + V1.Var_Price);
	}

}
