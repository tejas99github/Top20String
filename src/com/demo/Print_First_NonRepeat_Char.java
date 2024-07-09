package com.demo;

import java.util.Scanner;

public class Print_First_NonRepeat_Char {

	public static char findFirstNonRepeatedChar(String str) {

		// Create an array to store the count of each character
		int[] charCount = new int[256]; // Assuming ASCII characters

		// Iterate through the string and count occurrences of each character
		for (int i = 0; i < str.length(); i++) {
			charCount[str.charAt(i)]++;
		}

		// Iterate through the string again to find the first non-repeated character
		for (int i = 0; i < str.length(); i++) {
			if (charCount[str.charAt(i)] == 1) {
				return str.charAt(i);
			}
		}

		// If no non-repeated character is found, return '\0' (null character)
		return '\0';
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();

		char result = findFirstNonRepeatedChar(input);

		if (result != '\0') {
			System.out.println("First non-repeated character: " + result);
		} else {
			System.out.println("No non-repeated character found.");
		}
	}
}
