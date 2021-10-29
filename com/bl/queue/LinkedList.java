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

	// delete at first method
	public void popAtFirst() {
		Node temp;
		temp=head;
			System.out.print("peak in stack is ");
			peak();
			temp=temp.getNext();
			head = temp;
			size--;
			System.out.println("pop operation done !");
		if(head == null) {
			System.out.println("the stack is empty now");
		}
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
