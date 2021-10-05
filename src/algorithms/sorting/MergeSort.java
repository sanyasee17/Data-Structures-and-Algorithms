package algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 
 * Time Complexity : O(n Log n)
 * Space Complexity : O(n)
 * 
 */
public class MergeSort {

	// Merge Sort Function
	public List<Integer> mergeSort(List<Integer> array) {

		if (array.size() == 1) {
			return array;
		}

		List<Integer> left = array.subList(0, array.size() / 2);
		List<Integer> right = array.subList(array.size() / 2, array.size());

		return merge(mergeSort(left), mergeSort(right));

	}

	// Merge Function

	public List<Integer> merge(List<Integer> left, List<Integer> right) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		int leftIndex = 0;
		int rightIndex = 0;

		while (leftIndex < left.size() && rightIndex < right.size()) {

			if (left.get(leftIndex) < right.get(rightIndex)) {
				result.add(left.get(leftIndex));
				leftIndex++;
			} else {
				result.add(right.get(rightIndex));
				rightIndex++;
			}
		}

		List<Integer> leftRemaining = left.subList(leftIndex, left.size());
		List<Integer> rightRemaining = right.subList(rightIndex, right.size());

		result.addAll(leftRemaining);
		result.addAll(rightRemaining);

		return result;

	}

	public static void main(String[] args) {

		MergeSort sort = new MergeSort();
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
		System.out.println(sort.mergeSort(numbers));
	}
}
