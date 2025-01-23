package dataStructures;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);																									
		l1.add(40);
		l1.add(50);
		l1.add(60);
		
		System.out.println("Displaying all elements : ");															
		System.out.println(l1);
		
		System.out.println("\nNo. of elements in the ArrayList : " + l1.size());								
		
		System.out.println("\nElement at index 1 : " + l1.get(1));													
			
		System.out.println("\nIterating over the arraylist :");
		for(int i =0 ; i< l1.size() ; i++)
		{
			System.out.print(l1.get(i) + " ");
		}		
		System.out.println();
		
		l1.remove(5);																								
		System.out.println("\nAfter removing an element : ");
		System.out.println(l1);
		
		l1.add(2,100);
		System.out.println("\nAfter adding at particular index : " + l1);
		
		l1.set(2, 1000);
		System.out.println("\nAfter modifying at particular index : " + l1);
		
		l1.remove(Integer.valueOf(1000));
		System.out.println("\nAfter directly removing an element : "+l1);
		
		boolean ans = l1.contains(Integer.valueOf(40));
		System.out.println("\nCheck if the ArrayList contains 40 : ");
		System.out.println(ans);
		
		l1.add(60);
		l1.add(70);
		l1.add(20);
		l1.add(80);
		
		System.out.println(l1);
		
		System.out.println("\n40 is occurring at index : " + l1.indexOf(Integer.valueOf(40)));
		System.out.println("\nLast index of 20 is : "+ l1.lastIndexOf(Integer.valueOf(20)));
		
		System.out.println("\nThe ArrayList is empty ? : " + l1.isEmpty());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\nCreating an ArrayList without datatype : ");
		ArrayList l = new ArrayList();
		l.add("hello");
		l.add("rest");
		l.add(13);
		l.add(true);
		System.out.println(l);
	}

}
