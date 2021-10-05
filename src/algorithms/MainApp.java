package algorithms;

/*
 * Pratik's question
 */

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String theString = scan.next();
		int index = scan.nextInt();

		String newString = "";

		int startIndex = 0;

		for (int i = 0; i < theString.length(); i++) {

			if (Character.isDigit(theString.charAt(i))) {

				int num = Character.getNumericValue(theString.charAt(i));

				String tempString = newString + theString.substring(startIndex, i);

				newString = getString(tempString, num);

				startIndex = i + 1;
			}

		}

		// System.out.println(newString);

		System.out.println(newString.charAt(index - 1));

		scan.close();

	}

	private static String getString(String str, int num) {

		String theString = "";

		for (int i = 0; i < num; i++) {
			theString += str;
		}

		return theString;
	}

}
