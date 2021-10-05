package data_structures.arrays.stacks;

public class Stack {

	private Node top;
	private Node bottom;
	private int length;

	public Stack() {
		this.top = null;
		this.bottom = null;
		this.length = 0;
	}

	public String peek() {
		if (length > 0) {
			return top.value;
		}
		return null;
	}

	public void push(String value) {

		Node newNode = new Node(value);

		if (length == 0) {
			top = newNode;
			bottom = top;
		} else {
			newNode.next = top;
			top = newNode;
		}

		length++;

	}

	public void pop() {
		if (length > 0) {
			top = top.next;
		}
		if (length == 1) {
			bottom = null;
		}

		length--;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public String getLastElement() {
		if (length > 0) {
			return bottom.value;
		}
		return null;
	}

	public static void main(String[] args) {

		Stack theStack = new Stack();

		theStack.push("Google");
		theStack.push("Apple");
		theStack.push("Udemy");
		theStack.push("Discord");

		System.out.println(theStack.peek());

		theStack.pop();

		System.out.println(theStack.isEmpty());

		System.out.println(theStack.getLastElement());

	}

}
