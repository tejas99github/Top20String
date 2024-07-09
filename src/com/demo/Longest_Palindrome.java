package com.demo;

import java.util.Scanner;

public class Longest_Palindrome {

	public static String findLongestPalindrome(String str) {
		if (str == null || str.length() < 2) {
			return str;
		}

		String longestPalindrome = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substring = str.substring(i, j);
				if (isPalindrome(substring) && substring.length() > longestPalindrome.length()) {
					longestPalindrome = substring;
				}
			}
		}

		return longestPalindrome;
	}

	private static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		scanner.close();

		String longestPalindrome = findLongestPalindrome(input);
		System.out.println("Longest palindrome in \"" + input + "\" is : " + longestPalindrome);
	}
}

/*
 * && substring.length() > longestPalindrome.length() : If the length of the
 * current substring is greater, it means that this substring is longer than the
 * previously found longestPalindrome.
 * This check ensures that we update
 * longestPalindrome only if the current substring is longer than the previously
 * found longest palindrome. If not, we don't update longestPalindrome.
 */