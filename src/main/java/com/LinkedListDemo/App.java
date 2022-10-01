package com.LinkedListDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * LinkedList
 *
 */
public class App {
	private static final Logger logger = LogManager.getLogger(App.class);
	public static void main(String[] args) {
		logger.info("Welcome to implemented LinkedList");
		MyLinkedList list = new MyLinkedList();
		list.addData();
		list.addDataToTop();

	}
}
