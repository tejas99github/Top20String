package com.demo;

import java.util.Scanner;

public class Count_Vowels_Consonent {

	public static char toLowerCase(char ch) {
		// Check if the character is an uppercase letter
		if (ch >= 'A' && ch <= 'Z') {
			// Convert it to lowercase by adding the ASCII difference
			ch = (char) (ch + ('a' - 'A'));
		}
		return ch;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scanner.nextLine();
		scanner.close();

		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			// Check if the character is a letter
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

				// Convert the character to lowercase
				ch = toLowerCase(ch);

				// Check if the character is a vowel
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
	}

}

//  Digits			 : 0 (48) to 9 (57) 
//  Uppercase letters: A (65) to Z (90) 
//  Lowercase letters: a (97) to z (122)
