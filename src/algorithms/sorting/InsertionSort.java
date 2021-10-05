package algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {

	public static ArrayList<Integer> insertionSort(ArrayList<Integer> array) {

		for (int i = 0; i < array.size(); i++) {

			// if number less than 1st number. then move it at start of array.
			if (array.get(i) <= array.get(0)) {

				array.add(0, array.remove(i));
			}

			else {

				// else check where should the number be placed and move it.
				if (array.get(i) < array.get(i - 1)) {

					for (int j = 1; j < i; j++) {

						if (array.get(i) < array.get(j)) {
							array.add(j, array.remove(i));
							// end inner loop after element moved.
							break;
						}
					}
				}
			}
		}

		return array;
	}

	public static Integer[] insertionSort2(Integer[] array) {

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(array));

		for (int i = 1; i < list.size(); i++) { // Fixed: i start at i = 1
			if (list.get(i) <= list.get(0)) { // Fixed: duplicate values sort by changing to "<="
												// Checking if current number is suppose to be first
				list.add(0, list.remove(i)); // Moving the number to first position
				// list.remove(i + 1);
			} else {
				// only sort number smaller than number on the left of it.
				// This is the part of insertion sort that makes it fast
				// if the array is almost sorted.
				if (list.get(i) < list.get(i - 1)) {
					// find where number should go
					for (int j = 1; j < i; j++) {
						if (list.get(i) < list.get(j)) {
							// move number to the correct spot
							list.add(j, list.remove(i));
							break;

						}
					}
				}
			}
		}

		// TODO Auto-generated method stub
		return list.toArray(new Integer[0]);
	}

	public static void main(String[] args) {

		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));

		System.out.println(insertionSort(array));

		Integer[] arr = { 1, 8, 54, 9, 65, 1, 100, 0, 45 };

		Arrays.stream(insertionSort2(arr)).forEach(System.out::println);

	}

}
