package com.linkedlistdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<T> {
	private static final Logger logger = LogManager.getLogger(LinkedList.class);
	Node<T> head;
	Node<T> temp;
	int position = 0;

	public void addNode(T data) {
		// Create a new node
		Node<T> newNode = new Node<>(data);

		// Checks if the list is empty
		if (this.head == null) {
			// If list is empty, both head and temp will point to new node
			head = newNode;
			temp = newNode;
		} else {
			// newNode will be added after temp such that temp's next will point to newNode
			temp.next = newNode;
			// newNode will become new temp of the list
			temp = newNode;
		}
	}

	public void insertAtTop(T data) {
		Node<T> node = new Node<T>(data);
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node<T> temp;
			temp = head;
			head = node;
			head.next = temp;
		}
	}

	// To append node at the end of List
	public void append(T data) {
		Node<T> node = new Node<>(data); // Creating new node with given value

		// Checking if list is empty and assigning new value to head node.
		if (this.head == null) {
			head = node;
		}

		// If list already exists
		else {
			Node<T> temp = head; // Temporary node for traversal
			// Iterating till end of the List
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node; // Adding new valued node at the end of the list
		}
		position++;
	}

	// To add new node at any given position
	public void insert(int index, T data) {
		// Checking if position is valid
		if (index > position + 1) {
			logger.info("Position Unavailable in LinkedList");
			return;
		}
		// If new position is head then replace head node
		if (index == 1) {
			Node<T> temp = head; // Temporary node that stores previous head
			head = new Node<T>(data); // New valued node stored in head
			head.next = temp; // New head node pointing to old head node
			return;
		}
		Node<T> temp = head; // Temporary node for traversal
		Node<T> prev = new Node<T>(null);// Dummy node with null value that stores previous
		// iterating to the given position
		while (index - 1 > 0) {
			prev = temp; // assigning previous node
			temp = temp.next;// incrementing next node
			index--;
		}
		prev.next = new Node<T>(data); // previous node now points to new value
		prev.next.next = temp; // new value now points to former current node
	}

	// Delete first node of the list
	void pop() {
		if (this.head != null) {
			Node<T> temp = this.head;
			this.head = this.head.next;// move head to next of head
			temp = null;// delete node
		}
	}

	public void popLast() {
		Node<T> temp = head;
		Node<T> tail = head.next;
		// Checks if the list is empty
		if (head == null) {
			logger.info("List is empty");
			return;
		}
		// to remove last element of list if list contain more than one element
		while (temp != null && tail != null) {
			// once tail.next becomes null change second last node as tail
			if (tail.next == null) {
				tail = temp;
				// remove last element
				temp.next = null;
			}
			tail = tail.next;
			temp = temp.next;
		}
		// if list contains only one element
		if (head.next == null)
			tail = head;
		return;
	}

	// Search given element into Linked List and returns it's particular node if
	// found else returns null
	public Node<T> search(T data) {
		Node<T> temp = head;
		if (head == null) {
			return null;
		}

		// While loop is used to search the entire Linked
		while (temp != null) {

			// Returns the node of that particular element,if found.
			if (temp.data == data) {
				return temp;
			}
			temp = temp.next;
		}
		// Returns null if the element is not found
		return null;
	}

	// method will display all the nodes present in the list
	public void display() {
		// temp will point to head
		Node<T> temp = head;
		if (head == null) {
			logger.info("List is empty");
			return;
		}
		while (temp != null) {
			// Prints each node by incrementing pointer
			logger.info(temp.data);
			temp = temp.next;
		}
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
