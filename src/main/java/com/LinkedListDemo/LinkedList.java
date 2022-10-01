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
    
	//method will display all the nodes present in the list  
	public void display() {
		//temp will point to head  
		Node<T> temp = head;
		if (head == null) {
			logger.info("List is empty");
			return;
		}
		while (temp != null) {
			//Prints each node by incrementing pointer  
			logger.info(temp.data);
			temp = temp.next;
		}
	}
}

