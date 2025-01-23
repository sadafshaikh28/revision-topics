package dataStructures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollections {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(28);
		l1.add(8);
		l1.add(65);
		l1.add(70);
		l1.add(80);
		
		System.out.println(l1);
		//1..
		Collections.reverse(l1);
		
		System.out.println("Reversed list : " + l1 );
		//2
		Collections.sort(l1);
		
		System.out.println("Sorted List in ascending order : " + l1);
		//3
		Collections.sort(l1 , Collections.reverseOrder()); //comparator
		
		System.out.println("Sorted List in descending order : " + l1);
		
		ArrayList<String> l2 = new ArrayList<String>();
		
		l2.add("hello");
		l2.add("and");
		l2.add("welcome");
		
		System.out.println("OG : " + l2);
		Collections.sort(l2);
		System.out.println("Sorted : " + l2);
		Collections.sort(l2 , Collections.reverseOrder());
		System.out.println(l2);

	}

}
