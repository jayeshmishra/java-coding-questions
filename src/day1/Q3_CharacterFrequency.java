//Q3. Logic

//Pick one character
//
//Count how many times it appears

//“This solution checks every character against all others.”

package day1;

public class Q3_CharacterFrequency {

	public static void main(String[] args) {

		String str = "hello";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == c) {
					count++;
				}
			}

			System.out.println(c + "-> " + count);
		}

	}
}
