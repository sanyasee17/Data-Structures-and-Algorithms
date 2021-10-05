package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

	// Bubble Sort
	public static int[] bubbleSort(int[] array) {

		int length = array.length;

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - 1; j++) {
				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		return array;
	}

	public static void main(String[] args) {

		int[] array = { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };

		System.out.println(Arrays.toString(bubbleSort(array)));

	}

}
