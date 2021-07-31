/*This program reverse the string and checks if the reverse string is palindrome or not.
 * There are two functions declared 
 * 1. To reverse and return the reverse string.
 * 2. To check if the string is palindrome or not.
 */
import java.util.Scanner;
public class ReverseString {
	static String reverseString(String s) {
		String temp ="";
		for(int i = s.length()-1 ; i>=0; i--) {
			temp = temp + s.charAt(i);
		}
		return temp;
	}
	
	static boolean checkPalindrome(String a , String b) {
		if(a.equals(b)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string you want to reverse.");
		String sentence = in.nextLine();
		String revSentence = reverseString(sentence);
		System.out.println(revSentence);
		boolean check = checkPalindrome(sentence,revSentence);
		if(check== true) {
			System.out.println("The String is Palindrome");
		}else {
			System.out.println("The String is not Palindrome.");
		}

	}

}
