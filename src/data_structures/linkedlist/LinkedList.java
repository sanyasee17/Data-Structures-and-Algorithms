package data_structures.linkedlist;

import java.util.Arrays;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length;

	public LinkedList(int value) {
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

		newNode.next = head;
		head = newNode;
		length++;
	}

	/*
	 * Method to get the length of LinkedList
	 */
	public int getLength() {
		return length;
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
			Node CurrentNode = head;

			for (int i = 0; i < index - 1; i++) {
				CurrentNode = CurrentNode.next;
			}

			Node newNode = new Node(value);

			newNode.next = CurrentNode.next;
			CurrentNode.next = newNode;

			length++;
		}
	}

	/*
	 * remove() -->> remove item from an index
	 * 
	 * @param index return the deleted value
	 */
	public void remove(int index) {
		if (index < 0 || index > length) {
			System.out.println("Index out of bound : " + length);
		} else if (index == 0) {
			head = this.head.next;
			length--;
		} else {
			Node currentNode = head;
			int i;
			for (i = 0; i < index - 1; i++) {
				currentNode = currentNode.next;
			}
			currentNode.next = currentNode.next.next;

			this.length--;

			if (i == length - 1) {
				tail = currentNode;
			}
		}

	}

	public LinkedList reverse(LinkedList linkedList) {
		LinkedList newList = new LinkedList(linkedList.head.value);
		Node current = linkedList.head;
		while (current.next != null) {
			current = current.next;
			Node newNode = new Node(current.value);
			newNode.next = newList.head;
			newList.head = newNode;
			newList.length++;
		}
		return newList;
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

		LinkedList myLinkedList = new LinkedList(10);

		// append
		myLinkedList.append(12);
		myLinkedList.append(16);

		// prepend
		myLinkedList.prepend(20);
		myLinkedList.prepend(50);

		// insert
		myLinkedList.insert(2, 17);
		myLinkedList.insert(3, 18);

		System.out.println("length: " + myLinkedList.getLength());
		System.out.println("list: " + Arrays.toString(myLinkedList.printList()));

		// remove
		myLinkedList.remove(6);

		System.out.println("length: " + myLinkedList.getLength());

		System.out.println("list: " + Arrays.toString(myLinkedList.printList()));

		myLinkedList.append(122);
		myLinkedList.append(106);

		System.out.println("length: " + myLinkedList.getLength());
		System.out.println("list: " + Arrays.toString(myLinkedList.printList()));

	}
}