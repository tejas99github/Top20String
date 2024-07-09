package com.demo;

import java.util.Scanner;

public class A_Demo {

	static char toLowCase(char ch) {

		if (ch >= 'A' && ch <= 'Z') {
			ch = (char) (ch + ('a' - 'A'));
		}

		return ch;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string : ");
		String line = scanner.nextLine();
		int vow = 0;
		int cons = 0;
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				ch = toLowCase(ch);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vow++;
				} else {
					cons++;
				}
			}

		}
		System.out.println("Vowels : " + vow);
		System.out.println("consonent : " + cons);
		scanner.close();
	}

}