package data_structures.arrays;

import java.util.Arrays;

/*
 * 
 * This is class is to create a Array Data Structure to understand the operations
 * This is not a dynamic Array, for dynamic arrays in java please see {@link ArrayList}
 */

public class MyArray {

	private Object[] data;
	private int currentLength;
	private int size;

	// Constructor with no arguments that create a array of size 1 (default value)
	public MyArray() {

		// Default MyArray size is 1
		size = 1;
		currentLength = 0;
		data = new Object[1];
	}

	// get(index) --> get element at index
	public Object get(int index) {

		if (index > -1 && index < currentLength) {
			return data[index];
		} else {
			throw new RuntimeException("Index Out of Bound!");
		}
	}

	// push() --> add elements to the end of array
	public void push(Object obj) {

		if (size == currentLength) {
			data = Arrays.copyOf(data, size * 2);
			size *= 2;
		}

		data[currentLength] = obj;
		currentLength++;
	}

	// pop() --> remove last element
	public Object pop() {

		if (currentLength > 0) {
			Object lastItem = data[currentLength - 1];
			data[currentLength - 1] = null;
			currentLength--;
			return lastItem;
		} else {
			throw new RuntimeException("Index Out of Bound!");
		}
	}

	// delete(index) --> delete item from a particular index
	public Object delete(int index) {
		if (index > -1 && index < currentLength) {
			Object itemToDelete = data[index];
			shiftItems(index);
			return itemToDelete;
		} else {
			throw new RuntimeException("Index Out of Bound!");
		}
	}

	// shift items back to the index from where the item deleted
	private void shiftItems(int index) {

		for (int i = index; i < currentLength - 1; i++) {

			data[i] = data[i + 1];

		}

		data[currentLength - 1] = null;
		currentLength--;

	}

	// getAllItems() --> get all items from the array (for checking)
	public String getAllItems() {

		return Arrays.toString(data);
	}

	public static void main(String[] args) {

		MyArray array = new MyArray();

		array.push(8);
		array.push(17);
		array.push(18);
		array.push(10);
		array.push(20);

		System.out.println(array.pop());

		System.out.println(array.getAllItems());

		System.out.println(array.get(1));

		System.out.println(array.delete(2));

		System.out.println(array.getAllItems());

	}

}
