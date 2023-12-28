/**
 * Prints a given string, backward. Then prints the middle character in the
 * string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		//// Put your code here
		String originalString = args[0];
		String reversedString = "";
		char midChar;

		for (int i = originalString.length() - 1; i >= 0; i--) {

			reversedString = reversedString + originalString.charAt(i);
		}

		if (originalString.length()%2 == 0){

			midChar = originalString.charAt(originalString.length()/2 - 1);
		}
		else {
			midChar = originalString.charAt(((originalString.length()-1)/2));
		}



		System.out.println(reversedString);
		System.out.println("The middle character is " + midChar);
	}
}
