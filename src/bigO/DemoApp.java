package bigO;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * Class to check O(n)
 */
public class DemoApp {
	
	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<String>();
		
		arr.add("nemo");
		
		findNemo(arr); // ---> O(n) - Linear Time
		
		
		// declare an array for test purpose
		int[] arr2 = {0, 1, 2, 3, 4, 5};
		
		printFirstItemOfArray(arr2); // ---> O(1) - Constant Time
		
		
		printAllPairsOfArray(arr2); // ---> O(n^2) - Quadratic Time

		
	}
	
	public static void findNemo(List<String> list) {
		
		for(int i= 0; i < list.size(); i++) {
			
			if(list.get(i).equals("nemo")) {
				System.out.println("Found Nemo!!!");
			}
		}
		
	}
	
	
	
	public static void printFirstItemOfArray(int [] arr) {
		System.out.println(arr[0]);
	}
	
	
	public static void printAllPairsOfArray(int [] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length; j++) {
				
				System.out.println("[" + i + ", " + j + "]");
			}
		}
	}

}
