package com.demo;

import java.util.Scanner;

public class String_Palindrome {

	public static boolean isPalindrome(String s) { // MADAM

		int low = 0;
		int high = s.length() - 1; // 4

		while (low <= high) { // 0<=4, 1<=3, 2<=2 , 3<=1

			if (s.charAt(low) != s.charAt(high)) { // M!=M A!=A, D!=D
				return false;
			}

			low++; // 1,2 3
			high--; // 3,2,1
		}

		return true;
	}

	static boolean isPalindrome(String s, int i, int j) {

		if (s.charAt(i) != s.charAt(j)) {

			return false;
		}
		if (j <= i) {

			return true;
		}

		return isPalindrome(s, i + 1, j - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to check palindrome or not >> ");
		String str = scanner.nextLine();

		System.out.println("Using iterative : ");
		System.out.println(isPalindrome(str) == true ? "It Is Palindrome" : "It is Not Palindrome");

		System.out.println("Using recursive : ");
		System.out.println(isPalindrome(str, 0, str.length() - 1));
		scanner.close();
	}

}

//A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization). Some examples include:

//Words: "madam," "racecar," "level"
//Phrases: "A man, a plan, a canal, Panama!" (ignoring punctuation and spaces)
//Numbers: "121," "12321"