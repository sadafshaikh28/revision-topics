package dataStructures;

public class LinkedListDisplay {
	
	public static void print(Node head)
	{
		System.out.println("Printing the linked list:");
		
		Node temp = head;
		
		int count=0;
		
		while( temp != null)
		{
			count++;
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("\nNumber of elements in the linked list : " + count);
	}
	
	//writing recursive function for the same
	
	public static void displayr(Node head)
	{
		if(head == null) return;
		System.out.print(head.data + " ");
		displayr(head.next);	
	}
	
	//writing recursive function for printing the reverse of the list
	
	public static void displayrreverse(Node head)
	{
		if(head == null) return;
		displayrreverse(head.next);					//function call stack is created
		System.out.print(head.data + " ");
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
		
		Node a = new Node(5);
		Node b = new Node(3);
		Node c = new Node(9);
		Node d = new Node(8);
		Node e = new Node(16);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		
		print(a);
		System.out.println();
		displayr(a);
		System.out.println();
		displayrreverse(a);
	}

}
