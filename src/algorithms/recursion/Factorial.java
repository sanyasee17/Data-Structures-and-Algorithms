package algorithms.recursion;

public class Factorial {

	// O(n)
	public static int findFactorialRecursive(int num) {

		if (num == 1) {
			return 1;
		}

		return num * findFactorialRecursive(num - 1);
	}

	// O(n)
	public static int findFactorialIterative(int num) {

		if (num == 0) {
			return 1;
		}

		int fact = 1;

		for (int i = num; i > 1; i--) {
			fact *= i;
		}

		return fact;
	}

	public static void main(String[] args) {

		System.out.println(findFactorialIterative(5));

		System.out.println(findFactorialRecursive(5));

	}

}
