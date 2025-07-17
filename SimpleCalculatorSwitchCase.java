package tests;

import java.util.Scanner;

public class SimpleCalculatorSwitchCase {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter value for num1:");
		int num1 = scr.nextInt();
		System.out.println("Enter value for num2:");
		int num2 = scr.nextInt();
	    System.out.println("Enter + for Addition ");
	    System.out.println(" - for substraction"); 
	    System.out.println("x for multiplication");
	    System.out.println(" / for division");
	    char operator=scr.next().charAt(0);
		switch (operator) {
		case '+': // addition
			System.out.println("Sum:" + (num1 + num2));
			break;
		case '-': // subtraction
			System.out.println("Difference:" + (num1 - num2));
			break;
		case '*':// multiplication
			System.out.println("Product:" + (num1 * num2));
			break;
		case '/':// division
			if (num2 != 0)
				System.out.println("Quotient:" + (num1 / num2));
			else
				System.out.println("Division by Zero is not Valid");
			break;
		default:
			System.out.println("Invalid*****");
		}
	}
}
