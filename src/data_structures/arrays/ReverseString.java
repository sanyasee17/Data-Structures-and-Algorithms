package data_structures.arrays;

public class ReverseString {
	
	// Method 1: Using for loop 
	public static String reverse(String theString) {
		
		String tempString = "";
		
		for(int i = theString.length() - 1; i > -1; i--) {
			tempString += theString.charAt(i);
		}
		
		return tempString;
	}
	
	// Method 2: using StringBuilder 
	
	public static String reverse2(String theString) {
		String tempString = new StringBuilder(theString).reverse().toString();
		return tempString;
	}
	
	
	public static void main(String[] args) {
		
		String myString = "Please reverse this String!!";
		
		System.out.println(reverse(myString));
		
		System.out.println(reverse2(myString));
	}

}
