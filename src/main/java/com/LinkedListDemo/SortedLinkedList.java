package com.linkedlistdemo;

public class SortedLinkedList<T extends Comparable<T>> {
	private Node<T> head; // starting node
	private Node<T> current; // last node
	private int position; // position of last node

	public SortedLinkedList() {
		head = null;
		current = null;
		position = -1;
	}
	
	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			current = head;
		} else if (head.data.compareTo(data) > 0) {
			newNode.next = head;
			head = newNode;
		} else if (current.data.compareTo(data) < 0) {
			current.next = newNode;
			current = newNode;
		} else {
			Node<T> tempPrev = head;
			Node<T> tempCurrent = head.next;

			while ((tempCurrent != current) && (tempCurrent.data.compareTo(data) < 0)) {
				tempPrev = tempCurrent;
				tempCurrent = tempCurrent.next;

			}
			tempPrev.next = newNode;
			newNode.next = tempCurrent;
		}
		position++;
	}

	// To display the LinkedList
	@Override
	public String toString() {

		String S = "";

		Node<T> temp = head;

		if (temp == null)
			return S;

		while (temp.next != null) {
			S += String.valueOf(temp.data) + " -> ";
			temp = temp.next;
		}

		S += String.valueOf(temp.data);
		return S;
	}

}
