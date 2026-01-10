//Q1. Reverse a String

//Logic (Plain English)
//
//Start from last character
//
//Append characters one by one

//“I am iterating from the end of the string and building a reversed string.”



package day1;

public class Q1_ReverseString {

	public static void main(String[] args) {
		
		String str="hello";
		String rev="";
		
	
		for(int i=str.length()-1; i>=0; i--) {
			rev+=str.charAt(i);
		}
		
		System.out.println(rev);
		
	}
}
