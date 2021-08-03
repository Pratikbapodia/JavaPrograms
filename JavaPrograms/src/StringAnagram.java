// This programs check for same number of characters into a string irrespective of the
// sequence they are occuring . 
// If the length of the string in not equal then definitely the string is not anagram.

import java.util.*;
public class StringAnagram {

	static void stringAnagram(String a, String b) {
		boolean status = true;
		if(a.length() != b.length()) {
			status = false;
		} else {
			char[] s1 = a.toLowerCase().toCharArray();
			char[] s2= b.toLowerCase().toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);
			status = Arrays.equals(s1,s2);
		}
		if(status == true) {
			System.out.println("Is Anagram");
		}else {
			System.out.println("Is not Anagram");
		}
		
	}
	public static void main(String[] args) {
	 String s1 = "keep";
	 String s2 = "peek";
	 stringAnagram(s1, s2);
	 String s3 = "keep";
	 String s4 = "donotpeek";
	 stringAnagram(s3, s4);
	}

}
