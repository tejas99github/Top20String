package com.demo;

//Check if two string rotation of each other

/* A String is said to be a rotation of other string if they contain same characters and the sequence is rotated across any character, 
 e.g. "dabc" is a rotation of "abcd" but "dbac" is not. */

public class String_Rotation {

	// Method to check if two strings are rotations of each other
	public static boolean areRotations(String str1, String str2) {

		// Check if strings are of the same length and not null
		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}

		// Get the length of the strings
		int len = str1.length();

		// Create a new array to store the concatenated string (str1 + str1)
		char[] concatenated = new char[len * 2];

		for (int i = 0; i < len; i++) {
			concatenated[i] = str1.charAt(i);
			concatenated[i + len] = str1.charAt(i);
		}

		// Implement a manual substring search
		return isSubstring(concatenated, str2);
	}

	// Method to check if str2 is a substring of concatenated
	private static boolean isSubstring(char[] concatenated, String str2) {
		int len1 = concatenated.length;
		int len2 = str2.length();

		/*
		 * This outer loop iterates over the concatenated array. The loop variable i
		 * represents the starting index from where we begin checking for the
		 * substring.The loop runs until i reaches len1 - len2 because beyond this
		 * point, there aren't enough characters left in concatenated to match str2.
		 */
		for (int i = 0; i <= len1 - len2; i++) { // i=0||i=1||i=2

			int j;
			/*
			 * This inner loop checks if the substring of concatenated starting at index i
			 * matches str2.If a mismatch is found (concatenated[i + j] != str2.charAt(j)),
			 * the loop breaks and we move to the next starting index i.
			 */
			for (j = 0; j < len2; j++) { // j=0||j=0||j=0,1,2,3,4<4
				if (concatenated[i + j] != str2.charAt(j)) {// A!=C||B!=C||C==C,D==D,A==A,B==B
					break;
				}
			}

			/*
			 * If the inner loop completes without a break (i.e., j reaches len2), it means
			 * we found a complete match of str2 in concatenated starting at index i.
			 * Therefore, we return true indicating that str2 is a substring of
			 * concatenated.
			 */
			if (j == len2) {// 4==4
				return true;
			}
		}

		/*
		 * If the outer loop completes without finding any match, we return false,
		 * indicating that str2 is not a substring of concatenated.
		 */
		return false;
	}

	// Main method for testing the functionality
	public static void main(String[] args) {

		String str1 = "ABCD";
		String str2 = "CDAB";

		// Test the method and print the result
		if (areRotations(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are rotations of each other.");
		} else {
			System.out.println(str1 + " and " + str2 + " are NOT rotations of each other.");
		}
	}
}
