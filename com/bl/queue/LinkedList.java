package com.bl.queue;

public class LinkedList {

	Node head ,tail;
	int size ;

	// append at last method
	public void appendAtLast(int val) {
		Node node = new Node();
		node.setData(val);
		if(head == null) {
			head = node ;
			tail = node ;
		}
		else {
			tail=head;
			while(tail.getNext() != null) {
				tail=tail.getNext();
			}
			tail.setNext(node);
		}

		size++;
	}
	//method to show peak element in queue
	public void peak() {
		System.out.println(head.getData()) ;
	}


	//display queue elements
	public void display() {
		Node temp;
		temp=head;
		for(int i = 0 ; i < size ; i++)
		{
			System.out.println(temp.getData()) ;
			temp = temp.getNext();
		}
	}
}
