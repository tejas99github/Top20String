package com.demo;

import java.util.Scanner;

public class Count_Char_Occurance {

	public static int countOccurance(String input, String search) { // seek, e
		int count = 0;
		for (int i = 0; i < input.length(); i++) { // 0<4, 1<4, 2<4 ,3<4, 4<4

			for (int j = 0; j < search.length(); j++) { // 0<1

				if (input.charAt(i) == search.charAt(j)) { // s!=e, e==e, e==e, k!=e
					count++; // 1,2
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter  String : ");
		String input = obj.nextLine(); // seek

		System.out.println("Enter character to search : ");
		String search = obj.nextLine(); // e

		int count = countOccurance(input, search);

		System.out.println(count);
		obj.close();

	}

}
