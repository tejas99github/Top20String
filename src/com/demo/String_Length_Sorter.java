package com.demo;

import java.util.Scanner;

/*Program to sort String on their length in Java ! Write a Program to sort String on their length in Java? 
Your method should accept an array of String and return a sorted array based upon the length of String.*/

public class String_Length_Sorter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take input from the user for the array of strings
		System.out.print("Enter the number of strings: ");
		int n = scanner.nextInt();
		scanner.nextLine(); // Consume newline character

		String[] strings = new String[n];

		System.out.println("Enter the strings:");
		for (int i = 0; i < n; i++) {
			strings[i] = scanner.nextLine();
		}

		// Sort the strings based on their lengths
		String[] sortedStrings = sortStringsByLength(strings);

		// Display the sorted strings
		System.out.println("Sorted strings by length:");
		for (String str : sortedStrings) {
			System.out.println(str);
		}

		scanner.close();
	}

	public static String[] sortStringsByLength(String[] strings) {
		int n = strings.length;
		// Bubble sort algorithm

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// Compare the length of adjacent strings
				if (strings[j].length() > strings[j + 1].length()) {
					// Swap the strings
					String temp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = temp;
				}
			}
		}
		return strings;
	}
}

//If the user inputs 3 and presses Enter, the input buffer will have the characters: 3\n.
//scanner.nextInt() reads the 3 and leaves the \n in the input buffer.

//Consuming the Newline Character:

//This call reads the leftover \n from the buffer, effectively clearing it.
//Now, the input buffer is empty, and the next input operation will work correctly.

/*
 * int n = scanner.nextInt(); // User inputs: 3 // Input buffer: 3\n
 * 
 * scanner.nextLine(); // Consume the leftover newline // Input buffer is now
 * empty
 * 
 * for (int i = 0; i < n; i++) { strings[i] = scanner.nextLine(); // Correctly
 * reads each string }
 */
