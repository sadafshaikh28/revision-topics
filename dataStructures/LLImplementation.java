package dataStructures;

import dataStructures.LinkedListDisplay.Node;

public class LLImplementation {							//we have to understand the linked list implementation class as a data structure and the node class as user defined data type
	
	Node head=null;
	Node tail=null;
	
	void insertAtEnd(int val)
	{
		Node temp = new Node(val);
		
		if(head == null)
		{
			head=temp;
			tail= temp;
		}
		else 
		{
			tail.next = temp;
			tail=temp;
		}
	}
	
	void insertAtStart(int val)
	{
		Node temp = new Node(val);
		
		if(head==null)
		{
			head=temp;
			tail=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
	}
	
	void display()
	{
		System.out.println("Showing the linked list:");
		
		Node temp = head;
		
		while( temp != null)
		{
			
			System.out.print(temp.data + " ");
			temp = temp.next;
		}		
	}
	
	int size()
	{
		Node temp = head;
		int size=0;
		
		while( temp != null)
		{
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	public static class Node
	{
		int data;
		Node next;		
		Node(int data)
		{
			this.data = data;
		}
	}

	public static void main(String[] args) {
		
		LLImplementation ll = new LLImplementation();
		
		ll.insertAtEnd(5);
		ll.insertAtEnd(3);
		ll.insertAtEnd(9);
		ll.insertAtEnd(8);
		ll.display();
		
		System.out.println();
		
		ll.insertAtStart(7);
		
		ll.insertAtEnd(16);
		
		System.out.println();
		ll.display();
		
		int length = ll.size();
		System.out.println();
		System.out.println(length);
		
		

	}

}
