package com.demo;

import java.util.Scanner;

//Java program to find duplicate characters in a given String.

public class Print_Duplicate_Char {

	// Convert input string to char array
	public static char[] stringToCharArray(String str) {
		char[] charArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		return charArray;
	}

	public static void findDuplicateCharacters(String input) {

		// Convert input string to char array
		char[] characters = stringToCharArray(input); // {B,A,N,A,N,A} length=6

		// Builtin Method
//		char[] characters = input.toCharArray();

		// Array to mark characters as visited
		boolean[] visited = new boolean[characters.length]; // | 0F | 1F | 2F | 3T | 4T | 5T |

		// Iterate through each character in the string
		for (int i = 0; i < characters.length; i++) { // i=0. i=1. i=2. i=3. i=4. i=5 ->i<6

			// Skip if this character is already visited
			if (visited[i]) { // i[3]=true || i[4]=true || i[5]=true
				continue;
			}

			// Count occurrences of the current character
			int count = 1;
			for (int j = i + 1; j < characters.length; j++) { // FOR i=0 -> j=1,2,3,4,5 || FOR i=1 -> j=2,3,4,5 || FOR
																// i=2 -> j=3,4,5 -> j<6
				if (characters[i] == characters[j]) { // B!=A,N,A,N,A || A!=N,==A,!=N,==A || N!=A,==N,!=A
					count++; // A=3 || N=2
					visited[j] = true; // visited[3],[5]==true; visited[4]=true;
				}
			}

			// If the count is greater than 1, the character is a duplicate
			if (count > 1) {
				System.out.println("'" + characters[i] + "' appears " + count + " times.");
			}

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();
		findDuplicateCharacters(input);
	}

}
