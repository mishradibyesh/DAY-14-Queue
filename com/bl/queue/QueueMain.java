package com.bl.queue;

public class QueueMain {

	public static void main(String[] args) {

		QueueOperations operation = new QueueOperations();

		//adding data to queue
		operation.enqueu();

		//deleting data from queue
		operation.dequeue();
	}

}
