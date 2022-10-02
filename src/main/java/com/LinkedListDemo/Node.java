package com.linkedlistdemo;

public class Node<T> {

	 T data;       // Storing value of node
	 Node<T> next;// Storing address of next node

	Node(T data) {
        // This keyword refers to current object itself
		this.data = data;
		this.next = null;
	}
	
}
