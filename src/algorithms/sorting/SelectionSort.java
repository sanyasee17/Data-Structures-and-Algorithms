package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static int[] selectionSort(int[] array) {

		int length = array.length;

		for (int i = 0; i < length; i++) {
			int minIndex = i;
			int minValue = array[i];
			for (int j = i + 1; j < length; j++) {

				// searching minimum value

				if (array[j] < array[minIndex]) {
					minValue = array[j];
					minIndex = j;
				}
			}

			int temp = array[i]; // Swapping the minimum value found
			array[i] = minValue;
			array[minIndex] = temp;

		}

		return array;

	}

	public static void main(String[] args) {

		int[] array = { 99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0 };

		System.out.println(Arrays.toString(selectionSort(array)));

	}

}
