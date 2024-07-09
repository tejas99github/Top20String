package com.demo;

/*Write a function, which takes a String word and returns sentence on which words are reversed in order like 
if the input is "Java is best programming language", the output should be "language programming best is Java".*/

// Write a progm in java to reverse words in a String sentence .

public class Reverse_Sentence {
	public static void main(String[] args) {
		String sentence = "Hello World!";
		String reversedSentence = reverseWords(sentence);
		System.out.println(reversedSentence);
	}

	public static String reverseWords(String sentence) {

		char[] characters = sentence.toCharArray();

		reverse(characters, 0, characters.length - 1); // Reverse the entire sentence

		// Initialize start to 0.
		int start = 0;
		/*
		 * Iterate over each character in the array using a for loop. If a space
		 * character is encountered, it indicates the end of a word. The reverse method
		 * is called to reverse the characters from start to end - 1. Update start to
		 * end + 1 to set the starting index for the next word.
		 */
		for (int end = 0; end < characters.length; end++) {
			if (characters[end] == ' ') {
				reverse(characters, start, end - 1); // Reverse each word
				start = end + 1;
			}
		}
		/*
		 * Reverse Last Word: After the loop, the last word (which doesn't end with a
		 * space) is reversed by calling reverse with start and characters.length - 1.
		 */
		reverse(characters, start, characters.length - 1); // Reverse the last word

		return new String(characters);
	}

	// reverse character array
	public static void reverse(char[] array, int start, int end) {
		while (start < end) {
			char temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}
