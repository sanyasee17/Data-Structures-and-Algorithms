package algorithms.recursion;

/*
 * Fibonacci Series
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 */

import java.util.ArrayList;

public class Fibonacci {

	// O(2 ^n)
	public static int fibonacciRecursive(int n) {

		if (n < 2) {
			return n;
		}
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	// O(n)
	public static int fibonacciIterative(int n) {

		ArrayList<Integer> array = new ArrayList<>();

		array.add(0);
		array.add(1);

		for (int i = 2; i < n + 1; i++) {
			array.add(array.get(i - 1) + array.get(i - 2));
		}

		return array.get(n);
	}

	public static void main(String[] args) {

		System.out.println(fibonacciIterative(8));

		System.out.println(fibonacciRecursive(8));
	}

}
