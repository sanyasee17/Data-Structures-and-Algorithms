package data_structures.queue.using_linkedlist;

public class Queue {

	private Node first;
	private Node last;
	private int length;

	public Queue() {
		this.first = null;
		this.last = null;
		this.length = 0;
	}

	public String peek() {

		if (length > 0) {
			return this.first.value;
		}
		return null;

	}

	public void enqueue(String value) {

		Node newNode = new Node(value);

		if (length == 0) {

			this.first = newNode;
			this.last = newNode;

		} else {
			this.last.next = newNode;
			this.last = newNode;
		}

		this.length++;

	}

	public void dequeue() {
		if (this.length > 0) {
			this.first = this.first.next;
			if (this.length == 1) {
				this.last = null;
			}
		}

		length--;
	}

	public boolean isEmpty() {
		return this.length == 0;
	}

	public static void main(String[] args) {

		Queue theQueue = new Queue();

		System.out.println(theQueue.isEmpty());
		System.out.println(theQueue.peek());
		theQueue.enqueue("Apple");
		theQueue.enqueue("Google");
		theQueue.enqueue("Amazon");
		theQueue.enqueue("Facebook");
		theQueue.dequeue();
		System.out.println(theQueue.peek());

	}

}
