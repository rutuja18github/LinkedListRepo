package com.linkedlistdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLinkedList {
	private static final Logger logger = LogManager.getLogger(MyLinkedList.class);
	LinkedList<Integer> listObject;
	Stack<Integer> stack;
	 Queue<Integer> queue;
	// simple list add element
	public void addData() {
		listObject = new LinkedList<>();
		listObject.addNode(56);
		listObject.addNode(30);
		listObject.addNode(70);
		listObject.display();
	}

	// add element at top
	public void addDataToTop() {
		listObject = new LinkedList<>();
		listObject.insertAtTop(70);
		listObject.insertAtTop(30);
		listObject.insertAtTop(56);
		logger.info(listObject);
	}

	// append element
	public void appendList() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		logger.info(listObject);
	}

	// insert node at given position
	public void insertNode() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(70);
		logger.info(listObject);
		listObject.insert(2, 30);
		logger.info("printing list after inserting node at given position");
		logger.info(listObject);
	}

	// delete node at top of list
	public void popFront() {
		appendList();
		listObject.pop();
		logger.info("printing list after deleting first node");
		logger.info(listObject);
	}

	// Delete node at end
	public void deleteFromEnd() {
		appendList();
		listObject.popLast();
		logger.info("printing list after deleting last node");
		logger.info(listObject);
	}

	// Search Element
	public void searchElement() {
		appendList();
		Node<Integer> node = listObject.search(30);
		if (node == null) {
			logger.info("Element Not Found");
		} else {
			logger.info("Element present in linked list ");

		}
	}

	// Insert Element After Given Element
	public void insertAfterElement() {
		appendList();
		int position = listObject.index(30);
		if (position == -1) {
			logger.info("Element Not Found");
		} else {
			listObject.insert(position + 1, 40);
		}
		logger.info(listObject);
	}
	public void deleteElement() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(40);
		listObject.append(70);
		logger.info(listObject);
		boolean result=listObject.deleteNode(40);
		if (result==false) {
			logger.info("Element Not Found");
		} else {
			logger.info("Element is delete from list");
			logger.info(listObject);
		}
		logger.info("Linked list size "+listObject.size());
	}
	public void orderdList() {
		SortedLinkedList<Integer> orderedList= new SortedLinkedList<>();
		orderedList.add(56);
		orderedList.add(30);
		orderedList.add(40);
		orderedList.add(70);
		logger.info(orderedList);
	}
	public void implementStack() {
		stack=new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        logger.info("printing elements in stack");
        stack.printStack();
        logger.info("peeking stack");
        int topAtElement=(int)stack.peek();
        logger.info("Element at the top of stack "+topAtElement);
        logger.info("poping first item from stack");
        stack.pop();
        stack.printStack();
	}
	public void implementQueue() {
		queue=new Queue<>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
        logger.info("print elements of Queue");
        queue.printQueue();
	}
}
