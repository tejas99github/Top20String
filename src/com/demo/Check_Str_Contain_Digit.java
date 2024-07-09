package com.demo;

import java.util.Scanner;

public class Check_Str_Contain_Digit {

	public static boolean containsOnlyDigits(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter First String ");
		String str = obj.nextLine();
		obj.close();

		if (containsOnlyDigits(str)) {
			System.out.println("The string contains only digits.");
		} else {
			System.out.println("The string contains characters other than digits.");
		}
	}

}
/*
 * This Java code defines a method containsOnlyDigits that iterates through each
 * character in the string using a loop. It checks if each character falls
 * within the Unicode range of digits ('0' to '9'). If any character is found
 * outside of this range, the method returns false. If all characters are
 * digits, it returns true.
 */