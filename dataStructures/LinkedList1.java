package dataStructures;

public class LinkedList1 {
	
	public static class Node
	{
		int data;	//value
		Node next;	//address (whole next node)
		
		Node(int data)
		{
			this.data=data;
		}
	}

	public static void main(String[] args) {
		
		Node a = new Node(5);
		Node b = new Node(3);
		Node c = new Node(9);
		Node d = new Node(8);
		Node e = new Node(16);							
																	//System.out.println(a); //System.out.println(b.data);	
		a.next=b;
		//System.out.println(b);
		//System.out.println(a.next);
		
		b.next=c;
		c.next=d;
		d.next=e;
		
		//System.out.println(c.data);
		//System.out.println(c.next.data);   							//c.next = next node after c i.e. d therefore its like d.data
		//System.out.println(e.next);									//null
		//System.out.println(e.next.data);								//exception
		
		System.out.println("Displaying the linked list :");
		
		Node temp = a;							    //temp is not a new node , since we're not using new keyword to create it..its a reference variable which points to same memory as a
		
		for(int i=0 ; i<5 ; i++)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
				
	}

}
