package com.LinkedListDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.LinkedListDemo.LinkedList;

public class LinkedList<T> {
	private static final Logger logger = LogManager.getLogger(LinkedList.class);
	Node<T> head;
	Node<T> temp;

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

	void insertAtTop(T data) {
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
	void append(T data) {
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
	// @Override
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
