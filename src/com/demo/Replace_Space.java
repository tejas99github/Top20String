package com.demo;

//Java program to replace each given character to other e.g. blank with %20

/*For example, if the input is "Java is Great" and asked to replace space with %20
 then it should be "Java%20is%20Great".
*/
public class Replace_Space {

	public static String replaceSpaces(String input) {
		// Count spaces to determine the new length of the string
		int spaceCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				spaceCount++;
			}
		}

		// Calculate new length
		int newLength = input.length() + spaceCount * 2;
		char[] replaced = new char[newLength];

		// Iterate through the original string and replace spaces with "%20"
		int index = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				replaced[index++] = '%';
				replaced[index++] = '2';
				replaced[index++] = '0';
			} else {
				replaced[index++] = input.charAt(i);
			}
		}

		return new String(replaced);
	}

	public static void main(String[] args) {
		String input = "Java is Great";
		String replaced = replaceSpaces(input);
		System.out.println(replaced);
	}

}
