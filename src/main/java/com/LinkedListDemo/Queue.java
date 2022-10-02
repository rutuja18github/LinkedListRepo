package com.linkedlistdemo;

public class Queue<T> {
	Node<T> front;
	LinkedList<T> LinkedList = new LinkedList<T>();

	// add item to queue call linked list append method for it.
	public void enqueue(T item) {
		LinkedList.append(item);
	}

	// remove first element from queue.call linked list pop method.
	public Object dequeue() {
		front = LinkedList.head;
		LinkedList.pop();
		return front.data;
	}

	// print the queue
	public void printQueue() {
		LinkedList.display();
	}
}
