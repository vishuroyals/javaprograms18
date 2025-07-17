package tests;

//
//public class VowelOrConsonant {
//	public static void main(String[] args) {
//		Scanner scr = new Scanner(System.in);
//		System.out.println("Enter an Alphabet Character:");
//		char ch = scr.next().toLowerCase().charAt(0); //
//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//			System.out.println(ch + " is Vowel");
//		} else
//			System.out.println(ch + " is Consonant");
//	}
//}


import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter an Alphabet Character:");
        char ch = scr.next().toLowerCase().charAt(0); // Get first character, convert to lowercase

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a Consonant");
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
    }
}

