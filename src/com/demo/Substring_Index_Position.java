package com.demo;

import java.util.Scanner;
/*You need to write a function to search for the existence of a string (target) in another string (source). 
The function takes two strings as the input and returns the index where the second string is found. 
If the target string cannot be found, then return -1.*/

//Write a program to check if a String contains another String like indexOf ()

public class Substring_Index_Position {
	public static int indexOf(String source, String target) {
		if (source == null || target == null || source.length() < target.length()) {
			return -1;
		}

		// Iterate over the source string
		for (int i = 0; i <= source.length() - target.length(); i++) {
			// Check if the substring starting from index i matches the target string
			int j;
			for (j = 0; j < target.length(); j++) {
				if (source.charAt(i + j) != target.charAt(j)) {
					// If there's a mismatch, break out of the loop
					break;
				}
			}
			// If the inner loop completes without any breaks, it means the target string is
			// found
			if (j == target.length()) {
				return i; // Return the starting index of the target string in the source string
			}
		}
		// If the target string is not found in the source string, return -1
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take user input for the source string
		System.out.print("Enter the source string: ");
		String source = scanner.nextLine();

		// Take user input for the target string
		System.out.print("Enter the target string: ");
		String target = scanner.nextLine();

		// Call the indexOf method to find the target string in the source string
		int index = indexOf(source, target);
		if (index != -1) {
			System.out.println("Target string found at index: " + index);
		} else {
			System.out.println("Target string not found.");
		}

		scanner.close();
	}
}
