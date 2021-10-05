package data_structures.hashTable;

import java.util.HashSet;

/*
 * Google Question
 * 
 * Case 1:
 * Given an array = [2, 5, 1, 2, 3, 5, 1, 2, 4]
 * It should return 2
 * 
 * Case 2:
 * Given an array = [2, 1, 1, 2, 3, 5, 1, 2, 4]
 * It should return 1
 * 
 * Case 3:
 * Given an array = [2, 3, 4, 5]
 * It should return null;
 * 
 * 
 * Note: In our loop solution there is a bug in Test Case 2 
 */

public class FirstRecurringCharacter {
	
	
	/*
	 * Method 1: Using nested loop
	 * 
	 * Time Complexity : O(n^2)
	 * Space Complexity : O(1)
	 */
	public  static Integer firstRecurringCharacter(int[] array) {
		
		// check if empty input
		if(array == null) {
			return null;
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] == array[j]) {
					return array[i];
				}
			}
		}
		
		return null;
	}
	
	
	/*
	 * Method 2: Using HashSet
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(n)
	 */
	public static Integer firstRecurringCharacter2(int[] array) {
		
		// check if empty input
		if(array == null) {
			return null;
		}
		
		HashSet<Integer> hashTable = new HashSet<>();
		
		for(int item : array) {
			if(hashTable.contains(item)) {
				return item;
			}
			else {
				hashTable.add(item);
			}
		}
		
		return null;
		
	}
	
	

	public static void main(String[] args) {
		
		int[] array = {2, 5, 1, 2, 3, 5, 1, 2, 4}; // Test Case 1
		int[] array2 = {2, 1, 1, 2, 3, 5, 1, 2, 4}; // Test Case 2
		int[] array3 = {2, 3, 4, 5}; // Test Case 3
		int[] array4 = {}; // Test Case 4
		
		
		// Test using method 1
		System.out.println(firstRecurringCharacter(array));
		System.out.println(firstRecurringCharacter(array2));
		System.out.println(firstRecurringCharacter(array3));
		System.out.println(firstRecurringCharacter(array4));
		
		// Test using method 2
		System.out.println(firstRecurringCharacter2(array));
		System.out.println(firstRecurringCharacter2(array2));
		System.out.println(firstRecurringCharacter2(array3));
		System.out.println(firstRecurringCharacter2(array4));
		
		
		

	}

}


