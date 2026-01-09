//Logic

//Reverse the string
//
//Compare with original

//“If the reversed string is equal to the original, it is a palindrome.”

package com.practice.string;

public class PalindromeString {

	public static void main(String[] args) {

		String str="madam";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev+=str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
