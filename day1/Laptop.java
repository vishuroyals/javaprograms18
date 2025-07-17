package day1;

public class Laptop {
	String OS;
	String Processor;
	String RAM;
	String Brand;
	String Color;
	int price;

	public static void main(String[] args) {
		Laptop L1 = new Laptop();
		L1.OS = "Windows11";
		L1.Processor = "snapdragon888";
		L1.RAM = "8GBRAM";
		L1.Color = "Black";
		L1.price = 25000;
		System.out.println("OS:" + L1.OS);
		System.out.println("Processor:" + L1.Processor);
		System.out.println("RAM:" + L1.RAM);
		System.out.println("Brand:" + L1.Color);
		System.out.println("Color:" + L1.Color);
		System.out.println("Price:" + L1.price);
		System.out.println("------------------------------------------------");
		Laptop L2 = new Laptop();
		L2.OS = "Windows10";
		L2.Processor = "snapdragon23456";
		L2.RAM = "8GBRAM";
		L2.Color = "Black";
		L2.price = 2500090;
		System.out.println("OS:" + L2.OS);
		System.out.println("Processor:" + L2.Processor);
		System.out.println("RAM:" + L2.RAM);
		System.out.println("Brand:" + L2.Color);
		System.out.println("Color:" + L2.Color);
		System.out.println("Price:" + L2.price);

	}
}
