//Q3. First Non-Repeating Character
//problem:
//input:"swiss"
//output:w

//brute force logic:
//1.Pick one character
//2.Count how many times it appears
//3.If count==1 -> print and stop
package day2;

public class Q3_FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str="swiss";
		
		for(int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			int count=0;
			
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)==c) {
					count++;
				}
			}
			
			if(count==1) {
				System.out.println(c);
				break;
			}
		}
	}
}
