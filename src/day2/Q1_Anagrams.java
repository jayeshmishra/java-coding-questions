//Q1:Two strings are anagrams if they contain same characters in same count.
//Example:
//listen & silent ->  Anagram

//Brute Force Logic (Very Important)
//
//If lengths are different -> not anagram
//
//Pick one character from first string
//
//Count how many times it appears in both strings
//
//If any count differs -> not anagram

package day2;

public class Q1_Anagrams {

	public static void main(String[] args) {
		
		//if lengths are different- not anagram
		// pick one character from first string
		// count how many times it appeasrs in both strings
		// if any count differs -> not anagram
		
		String s1="listen";
		String s2="silentt";
		
		boolean isAnagram=true;
		
		if(s1.length()!=s2.length()) {
			isAnagram=false;
		}else {
			for(int i=0;i<s1.length();i++) {
				char c=s1.charAt(i);
				int count1=0;
				int count2=0;
				
				for(int j=0; j<s2.length(); j++) {
					if(s1.charAt(j)==c) {
						count1++;
					}
					if(s2.charAt(j)==c) {
						count2++;
					}
					
				}
				
				if(count1!=count2) {
					isAnagram=false;
					break;
				}
			}
		}
	
		System.out.println(isAnagram);

	}
}