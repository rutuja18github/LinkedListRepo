package com.linkedlistdemo;

public class Stack<T> {
	LinkedList<T> linkedList=new LinkedList<T>();
	Node<T> head;
	public void push(T data){
		linkedList.insertAtTop(data);
	}
	public void printStack() {
		linkedList.display();
	  }
}
