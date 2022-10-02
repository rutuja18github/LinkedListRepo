package com.linkedlistdemo;

public class Queue<T> {
	Node<T> front;
	LinkedList<T> LinkedList = new LinkedList<T>();

	// add item to queue call linked list append method for it.
	public void enqueue(T item) {
		LinkedList.append(item);
	}
	// print the queue
	public void printQueue() {
		LinkedList.display();
	}
}
