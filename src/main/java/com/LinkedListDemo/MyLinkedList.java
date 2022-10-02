package com.LinkedListDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLinkedList {
	LinkedList<Integer> listObject;
	private static final Logger logger = LogManager.getLogger(MyLinkedList.class);

	public void addData() {
		listObject = new LinkedList<>();
		listObject.addNode(56);
		listObject.addNode(30);
		listObject.addNode(70);
		listObject.display();
	}

	public void addDataToTop() {
		listObject = new LinkedList<>();
		listObject.insertAtTop(70);
		listObject.insertAtTop(30);
		listObject.insertAtTop(56);
		logger.info(listObject);
	}
	public void appendList() {
		listObject = new LinkedList<>();
		listObject.append(56);
		listObject.append(30);
		listObject.append(70);
		logger.info(listObject);
	}
	public void insertNode() {
		listObject = new LinkedList<>();
        listObject.append(56);
        listObject.append(70);
        logger.info(listObject);
        listObject.insert(2,30);
        logger.info("printing list after inserting node at given position");
        logger.info(listObject);
    }
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
}
