//This program counts the number of character in a string avoiding some special characters and spaces.

import java.util.Scanner;
public class CountCharacters {
	// Function Declaration : Taking on input String
	static int noOfCharacters(String s) {
		int characters = 0; // Declaring and initializing characters count to 0.
		
		// For Loop : To parse through the String using String.length() method and checking 
		//for the characters.
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i) != ' ' && s.charAt(i) != '?' && s.charAt(i) != '!' && s.charAt(i) != '.' ) {
				characters = characters + 1;
			}
		}
		return characters; // Returning count of characters
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String you want to enter : ");
		String s = in.nextLine();
		int characters = noOfCharacters(s);
		System.out.println("Number of Characters : "+characters);
		

	}

}
