package com.linkedlistdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLinkedList {
	LinkedList<Integer> listObject;
	private static final Logger logger = LogManager.getLogger(MyLinkedList.class);

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
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		logger.info(listObject);
		listObject.pop();
		logger.info("printing list after deleting first node");
		logger.info(listObject);
	}

	// Delete node at end
	public void deleteFromEnd() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		logger.info(listObject);
		listObject.popLast();
		logger.info("printing list after deleting last node");
		logger.info(listObject);
	}

	// Search Element
	public void searchElement() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		logger.info(listObject);
		Node<Integer> node = listObject.search(80);
		if (node == null) {
			logger.info("Element Not Found");
		} else {
			logger.info("Element present in linked list ");

		}
	}

	// Insert Element After Given Element
	public void insertAfterElement() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		logger.info(listObject);
		int position = listObject.index(30);
		if (position == -1) {
			logger.info("Element Not Found");
		} else {
			listObject.insert(position + 1, 40);
		}
		logger.info(listObject);

	}

}
