package conditionalstatements;

import java.util.Scanner;

public class TwoDigit {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any number=");
		int num = scr.nextInt();
		if ((num >= 10 && num <= 99) || (num >= -99 && num <= -10)) {
			System.out.println(num + " is a two digit number .........");
		} else {
			System.out.println(num + "is not a two digit number ....... ");
		}
		if ((num >= 100 && num <= 999) || (num >= -999 && num <= -100)) {
			System.out.println(num + " is a three digit number .........");
		} else {
			System.out.println(num + "is not a three digit number ....... ");
		}
		if ((num >= 1000 && num <= 9999) || (num >= -9999 && num <= -1000)) {
			System.out.println(num + " is a four digit number .........");
		} else {
			System.out.println(num + "is not a four digit number ....... ");
		}
		if ((num >= 10000 && num <= 99999) || (num >= -99999 && num <= -10000)) {
			System.out.println(num + " is a five digit number .........");
		} else {
			System.out.println(num + "is not a five digit number ....... ");
		}
		if ((num >= 100000 && num <= 999999) || (num >= -999999 && num <= -100000)) {
			System.out.println(num + " is a six digit number .........");
		} else {
			System.out.println(num + "is not a six digit number ....... ");
		}
	}
}
