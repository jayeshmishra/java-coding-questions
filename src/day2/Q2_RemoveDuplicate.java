//Q2: Remove duplicate characters from string 
//problem:
//	input: "programming"
//	output: "programin" (order preserved)

//brute force logic:
//1.pick one character 
//2. check if it appeared before
//3.if yes -> skip
//4. if no -> print/store
package day2;

public class Q2_RemoveDuplicate {

	public static void main(String[] args) {
		String str="programming";
		String result="";
		
		for(int i=0; i<str.length(); i++) {
			char current=str.charAt(i);
			boolean isDuplicate=false;
			
			for(int j=0; j<i; j++) {
				if(str.charAt(j)==current) {
					isDuplicate=true;
					break;
					
				}
			}
			
			if(!isDuplicate) {
				result+=current;
			}
		}
		
		System.out.println(result);
	}
}
