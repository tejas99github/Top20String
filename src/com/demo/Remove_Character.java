package com.demo;

import java.util.Scanner;

public class Remove_Character {

	// Iterative solution without StringBuilder
	public static String removeCharIterative(String str, char chToRemove) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != chToRemove) {
				result = result + str.charAt(i);
			}
		}
		return result;
	}

	// Recursive solution without StringBuilder
	public static String removeCharRecursive(String str, char chToRemove) {
		if (str.length() == 0) {
			return "";
		}

		char firstChar = str.charAt(0);
		if (firstChar == chToRemove) {
			return removeCharRecursive(str.substring(1), chToRemove);
		} else {
			return firstChar + removeCharRecursive(str.substring(1), chToRemove);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take user input for the string and character to remove
		System.out.print("Enter a string: ");
		String inputString = scanner.nextLine();

		System.out.print("Enter the character to remove: ");
		char charToRemove = scanner.next().charAt(0);

		scanner.close();

		// Iterative solution
		String resultIterative = removeCharIterative(inputString, charToRemove);
		System.out.println("After removing '" + charToRemove + "' (Iterative): " + resultIterative);

		// Recursive solution
		String resultRecursive = removeCharRecursive(inputString, charToRemove);
		System.out.println("After removing '" + charToRemove + "' (Recursive): " + resultRecursive);
	}
}
