package data_structures.arrays.stacks;

import java.util.ArrayList;

public class StackUsingArray {

	ArrayList<String> stack;

	public StackUsingArray() {
		this.stack = new ArrayList<>();
	}

	public String peek() {
		if (this.stack.size() > 0) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}

	public void push(String value) {

		this.stack.add(value);
	}

	public void pop() {

		this.stack.remove(stack.size() - 1);
	}

	public boolean isEmpty() {
		return stack.size() == 0;
	}

	public static void main(String[] args) {

		Stack theStack = new Stack();

		theStack.push("Google");
		theStack.push("Apple");
		theStack.push("Udemy");
		theStack.push("Discord");

		System.out.println(theStack.peek());

		theStack.pop();

		System.out.println(theStack.peek());

		System.out.println(theStack.isEmpty());
	}

}
