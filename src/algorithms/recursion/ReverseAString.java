package algorithms.recursion;

public class ReverseAString {

	public static void main(String[] args) {

		System.out.println(reverseString("yoyo Master!"));

	}

	public static String reverseString(String theString) {

		if (theString.length() == 0) {
			return "";
		}

		return reverseString(theString.substring(1)) + theString.charAt(0);

	}

}
