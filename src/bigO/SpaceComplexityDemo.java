package bigO;

import java.util.ArrayList;
import java.util.List;

public class SpaceComplexityDemo {

	public static void main(String[] args) {
		
		booooo(5); // Space Complexity - O(1)
		
		
		arrayOfNTimesHi(8); // Space Complexity - O(n)
		
		

	}

	private static void booooo(int n) {
		
		for(int i = 0; i < n; i++) {
			System.out.println("Booooo!!");
		}
		
	}

	private static void arrayOfNTimesHi(int n) {
		
		List<String> array = new ArrayList<String>();
		
		for(int i = 0; i < n; i++) {
			
			array.add("Hi");
		}
		
		System.out.println(array);
	}

}
