package data_structures.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
	
	
	// Method 1
	public static int[]  mergeTwoSortedArrays(int[] array1, int[] array2) {
		
		// return second array if first array is empty
		if(array1.length == 0) {
			return array2;
		}
		// return first array if second array is empty
		if(array2.length == 0) {
			return array1;
		}
		
		// else
		int[] mergedArray = new int[array1.length + array2.length];
		
		int j = 0;
		int k = 0;
		
		for(int i =0; i < mergedArray.length; i++) {
			if(j != array1.length && (k == array2.length || array1[j] < array2[k])) {
				mergedArray[i] = array1[j];
				j++;
			}
			else {
				mergedArray[i] = array2[k];
				k++;
			}
		}
		
		return mergedArray;
	}
	
	
	// Method 2
	
	public static int[] mergeTwoSortedArrays2(int[] array1, int[] array2) {
		
		// return second array if first array is empty
		if(array1.length == 0) {
			return array2;
		}
		// return first array if second array is empty
		if(array2.length == 0) {
			return array1;
		}
		
		// else
		int[] mergedArray = new int[array1.length + array2.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < array1.length && j < array2.length) {
			if(array1[i] < array2[j]) {
				mergedArray[k] = array1[i];
				i++;
				k++;
			}
			else {
				mergedArray[k] = array2[j];
				j++;
				k++;
			}
		}
		
		while(i < array1.length) {
			mergedArray[k] = array1[i];
			i++;
			k++;
		}
		
		while(j < array2.length) {
			mergedArray[k] = array2[j];
			j++;
			k++;
		}
		
		return mergedArray;
	}

	
	public static void main(String[] args) {
		
		int[] arr = mergeTwoSortedArrays(new int[]{0, 3, 7}, new int[]{5, 10, 17, 20});
		int[] arr2 = mergeTwoSortedArrays2(new int[]{0, 3, 7}, new int[]{5, 10, 17, 20});
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
