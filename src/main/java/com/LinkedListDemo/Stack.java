package com.linkedlistdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stack<T> {
	private static final Logger logger = LogManager.getLogger(Stack.class);
	LinkedList<T> linkedList=new LinkedList<T>();
	Node<T> top;
	public Stack() {
        this.top = null;
    }
	public void push(T data){
		linkedList.insertAtTop(data);
	}
	public void pop() {
	    linkedList.pop();
	    top = linkedList.head; 
	  }
	public T peek() {
		top = linkedList.head; 
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return null;
        }
	  }
	// check stack is empty
    public boolean isEmpty() {
        return top == null;
    }
	public void printStack() {
		linkedList.display();
	  }
	
}
