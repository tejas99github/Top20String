package com.demo;

import java.util.Scanner;

public class Reverse_String {
	// LBP
	public static String reverseIterative(String s) {

		String reverse = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			reverse = c + reverse;
		}
		return reverse;
	}

	// TAP
	static String reverseRecersive(String s, String r, int i) {

		if (i < 0) {
			return r;
		}

		return reverseRecersive(s, r + s.charAt(i), i - 1);
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter String ");
		String originalString = obj.nextLine();

		String reverseIterative = reverseIterative(originalString);
		System.out.println("Reverse String by Iterative : " + reverseIterative);

		String reverseRecersive = reverseRecersive(originalString, "", originalString.length() - 1);
		System.out.println("Reverse String by Recursive : " + reverseRecersive);

		obj.close();
	}

}
