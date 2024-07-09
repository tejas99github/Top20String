package com.demo;

//java program to  remove duplicate characters from String
//For example, if the input is ‘bananas’ the output will be ‘bans’

public class Remove_Duplicate_Char {

	public static String removeDuplicates(String input) {

		char[] chars = input.toCharArray(); // ['b', 'a', 'n', 'a', 'n', 'a']

		/*
		 * A boolean array encountered of size 256 is created. This array will keep
		 * track of which characters have already been seen. The size 256 is chosen
		 * assuming ASCII characters, where each character's ASCII value ranges from 0
		 * to 255.
		 */
		boolean[] encountered = new boolean[256];

		/*
		 * Index to Track Position of Non-Duplicate Characters. currentIndex is
		 * initialized to 0. It will be used to place non-duplicate characters in the
		 * chars array.
		 */
		int currentIndex = 0; // 1,2

		/*
		 * The program iterates through each character in the chars array. For each
		 * character (currentChar), it checks if the character has been encountered
		 * before using the encountered array. If currentChar has not been encountered
		 * (!encountered[currentChar] is true), it is added to the chars array at the
		 * position currentIndex, and currentIndex is incremented. The encountered array
		 * is updated to mark currentChar as encountered (encountered[currentChar] =
		 * true).
		 */
		for (int i = 0; i < chars.length; i++) {

			char currentChar = chars[i]; // b,a,n,a

			if (!encountered[currentChar]) {// enc[b,a,n]=!flase=true || enc[a,n,a]=!true=false

				chars[currentIndex++] = currentChar; // chars[0]=b,chars[1]=a,chars[2]=n,

				encountered[currentChar] = true; // enc[b]=true || enc[a]=true || enc[n]=true
			}
		}

		/*
		 * Create New String from Filtered Characters. A new string is created from the
		 * chars array, starting from index 0 to currentIndex. This new string includes
		 * only the non-duplicate characters.
		 */
		return new String(chars, 0, currentIndex);
	}

	public static void main(String[] args) {

		String input = "banana";
		String output = removeDuplicates(input);
		System.out.println(output);
	}

}
