package com.bl.queue;

public class QueueOperations {

	public void enqueu() {
		LinkedList list = new  LinkedList();
		list.appendAtLast(70);
		list.appendAtLast(30);
		list.appendAtLast(50);

		//printing the data in stack
		list.display();
	}
	public void dequeue() {
		LinkedList list = new  LinkedList();
		list.appendAtLast(70);
		list.appendAtLast(30);
		list.appendAtLast(50);
		list.popAtFirst();
		
		//printing after deleting
		list.display();
	}
}
