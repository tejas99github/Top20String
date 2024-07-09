package com.demo;

import java.util.Scanner;

//Java program to check if two given strings are anagrams of Each other.

/*Two String is called anagram, if they contain the same characters but on different order
e.g. army and mary, stop and pots,
*/

public class Anagram_String {

	// count lenght of string
	public static int strLength(String str) {
		int lenght = 0;
		for (char ch : str.toCharArray()) {
			lenght++;
		}
		return lenght;
	}

	// Convert input string to char array
	public static char[] stringToCharArray(String s) {
		char[] charArray = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			charArray[i] = s.charAt(i);
		}
		return charArray;
	}

	// sorting algorithm (Bubble Sort)
	public static void sort(char[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First String ");
		String str1 = obj.nextLine();
		System.out.println("Enter Second String");
		String str2 = obj.nextLine();
		obj.close();

		// Check if lengths of strings are equal
		if (str1.length() != str2.length()) {
			System.out.println("false");
			return;
		}

		// Convert strings to character arrays
//		char[] ch1 = str1.toCharArray();
//		char[] ch2 = str2.toCharArray();

		char[] ch1 = stringToCharArray(str1);
		char[] ch2 = stringToCharArray(str2);

		// Sorting the char array
//        Arrays.sort(ch1);

		// Sort character arrays using a custom sorting algorithm
		sort(ch1);
		sort(ch2);

		// Compare sorted arrays character by character
		boolean areAnagrams = true;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				areAnagrams = false;
				break;
			}
		}

		// Print result
		System.out.println(areAnagrams);
	}

}
