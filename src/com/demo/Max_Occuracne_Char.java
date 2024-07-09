package com.demo;

import java.util.Scanner;

//Program to return the highest occurred character in a String
//LBP
public class Max_Occuracne_Char {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = obj.nextLine();

		// Array to store character frequencies
		int a[] = new int[256];

		// Index of the character with maximum occurrence
		int max = 0;

		// Count frequencies of each character in the input string
		for (int i = 0; i < s.length(); i++) {
			a[(int) s.charAt(i)]++;
		}

		// Find the index of the character with maximum occurrence
		for (int i = 0; i < 256; i++) {
			if (a[i] > a[max])
				max = i;
		}

		// Print the character with maximum occurrence
		System.out.println((char) max);

		obj.close();
	}

}
