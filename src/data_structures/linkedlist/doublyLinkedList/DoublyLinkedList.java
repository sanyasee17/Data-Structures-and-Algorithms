package data_structures.linkedlist.doublyLinkedList;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int length;

	public DoublyLinkedList(int value) {
		head = new Node(value);
		tail = head;
		length = 1;
	}

	/*
	 * append() -->> add to the end of linked List
	 * 
	 * @param int value
	 * 
	 * @return void
	 */
	public void append(int value) {
		Node newNode = new Node(value);
		newNode.prev = tail;
		tail.next = newNode;
		tail = newNode;
		length++;
	}

	/*
	 * 
	 * prepend() -->> add to the start of Linked Lsit
	 * 
	 * @param int value
	 * 
	 * @return void
	 */
	public void prepend(int value) {
		Node newNode = new Node(value);

		head.prev = newNode;
		newNode.next = head;
		head = newNode;
		length++;
	}

	/*
	 * insert() -->> insert into the Linked List at a index
	 * 
	 * @param index, value return void
	 */
	public void insert(int index, int value) {
		if (index < 0 || index > length) {
			System.out.println("Index out of bound : " + index);
		} else if (index == 0) {
			prepend(value);
		} else if (index == length) {
			append(value);
		} else {
			Node currentNode = head;

			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.next;
			}

			Node newNode = new Node(value);

			Node leader = currentNode;
			Node follower = currentNode.next;

			newNode.next = follower;
			newNode.prev = leader;
			follower.prev = newNode;

			length++;
		}
	}

	/*
	 * Method to get the length of LinkedList
	 */
	public int getLength() {
		return length;
	}

	/*
	 * Method to print the LinkedList
	 */
	public int[] printList() {
		int[] list = new int[length];
		Node currentNode = this.head;
		int i = 0;
		while (currentNode != null) {

			list[i] = currentNode.value;
			currentNode = currentNode.next;
			i++;
		}

		return list;
	}

	public static void main(String[] args) {

	}

}
