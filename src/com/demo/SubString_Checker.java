package com.demo;

import java.util.Scanner;

//Code and algorithm to check if a given short string is a substring of the main string. 

public class SubString_Checker {
	public static boolean isSubstring(String mainString, String subString) {
		if (mainString == null || subString == null) {
			return false;
		}

		int mainLength = mainString.length();
		int subLength = subString.length();

		// If the substring is longer than the main string, it can't be a substring
		if (subLength > mainLength) {
			return false;
		}

		// Loop through the main string
		for (int i = 0; i <= mainLength - subLength; i++) {
			int j;
			// Check if the substring matches starting from index i in the main string
			for (j = 0; j < subLength; j++) {
				if (mainString.charAt(i + j) != subString.charAt(j)) {
					break;
				}
			}
			// If the loop completed without breaking and j reached subLength, substring
			// found
			if (j == subLength) {
				return true;
			}
		}
		// Substring not found
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the main string: ");
		String mainString = scanner.nextLine();

		System.out.print("Enter the substring to check: ");
		String subString = scanner.nextLine();

		scanner.close();

		if (isSubstring(mainString, subString)) {
			System.out.println("Substring found");
		} else {
			System.out.println("Substring not found");
		}
	}
}
