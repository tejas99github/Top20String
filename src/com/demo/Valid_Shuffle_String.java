package com.demo;

//Program to check if a String is a valid shuffle of two String

public class Valid_Shuffle_String {

	public static boolean isValidShuffle(String first, String second, String third) {
		// Length of the three strings
		int len1 = first.length();
		int len2 = second.length();
		int len3 = third.length();

		// If the combined length of the first and second strings is not equal to the
		// length of the third string,
		// then third cannot be a valid shuffle of first and second.
		if (len1 + len2 != len3) {
			return false;
		}

		// Pointers to iterate through all three strings
		int i = 0, j = 0, k = 0;

		// Iterate through third string
		while (k < len3) { // 0<6,1<6,2<6,3<6,4<6,5<6,6!=6

			// If the current character of the third string matches with the current
			// character of the first string,
			// move pointer of the first string to the next character
			if (i < len1 && first.charAt(i) == third.charAt(k)) {// 0<3 && a==a, 1<3 && b==b, 2<3 && c==c
				i++; // 1, 2, 3
			}
			// If the current character of the third string matches with the current
			// character of the second string,
			// move pointer of the second string to the next character
			else if (j < len2 && second.charAt(j) == third.charAt(k)) {// 0<3 && d==d, 1<3 && e==e, 2<3 && f==f
				j++; // 1,2
			}
			// If neither of the above conditions is satisfied, then third cannot be a valid
			// shuffle of first and second.
			else {
				return false;
			}
			// Move pointer for the third string to the next character
			k++; // 1,2,3,4,5,6
		}

		// If all characters of third are traversed and the characters are interleaved
		// correctly from first and second,
		// then return true
		return true;
	}

	public static void main(String[] args) {
		String first = "abc";
		String second = "def";
//		String third = "dcaebf";
//		String third = "adbecf";
		String third = "dabecf";

		if (isValidShuffle(first, second, third)) {
			System.out.println("Valid shuffle");
		} else {
			System.out.println("Not a valid shuffle");
		}
	}
}

/*
 * Problem : You are given 3 strings: first, second, and third. Third String is
 * said to be a shuffle of first and second if it can be formed by interleaving
 * the characters of first and second String in a way that maintains the left to
 * the right ordering of the characters from each string.
 * 
 * For example, given first = "abc" and second = "def", third = "dabecf" is a
 * valid shuffle since it preserves the character ordering of the two strings.
 * 
 */