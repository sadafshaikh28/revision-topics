package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//stream API is an interface in java.util

public class StreamMain1 {

	public static void main(String[] args) {
		
		// comparing task on list normal way vs stream API
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(26);
		list1.add(25);
		list1.add(78);
		list1.add(34);
		list1.add(11);
		
		// filtering out even numbers from this list conventional manner
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(Integer i : list1)
		{
			if(i%2==0)
			{
				list2.add(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(list2);
		
		// same operation with streams
		
		//list1 se ek stream nikalenge
		Stream<Integer> stream = list1.stream();
		//ye stream pe ab methods to pipeline karenge for returning a filtered list
		List<Integer> listEven = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(listEven);
		
		// another example - for filtering numbers greater than 30
		// directly ek line mein hogaya , by pipelining even the stream method
		List<Integer> list3 = list1.stream().filter(i -> i>30).collect(Collectors.toList());
		System.out.println(list3);
		
		//the Collectors.toList() method at the end returns List type so all this is stored in a list.
		
		// -------------------------------------------------------------------------------------------------
		
		List<Integer> listNew = new ArrayList<Integer>();
		listNew.add(15);
		listNew.add(12);
		listNew.add(8);
		listNew.add(30);
		listNew.add(45);
		listNew.add(79);
		listNew.add(88);
		listNew.add(60);
		
		System.out.println();
		double average = listNew.stream().collect(Collectors.averagingInt(n ->n));
		System.out.println("\nAverage of listNew values: "+average +"\n");
		
		//Stream<Integer> s1=listNew.stream().map(i -> i+2);
		
		List<Integer> l1 = listNew.stream().map(i -> i+2).collect(Collectors.toList());
		
		System.out.println(l1);
		System.out.println("-------------------------------------------------------------------------------------------\n");
		//------------------------------------------------------------------------------------------------------------
		System.out.println(listNew);
		// sum of all elements using reduce method  (initial value , (binary operators) -> lambda function)
		int sum=listNew.stream().reduce(0,(a,b) -> a+b);
		System.out.println();
		System.out.println("Sum of all the elements from the list: "+sum);
				
		//max value from listNew
		int max = listNew.stream().reduce(0, (a,b) -> a>b?a:b);
		System.out.println("Maximum value from the list: "+ max +"\n");
		
		//max value with method reference: 
		int maxVal = listNew.stream().reduce(Integer :: max).get();
		System.out.println("Max value using method reference: "+maxVal);
		
		// streamline filter , map and reduce
		System.out.println();
		Integer calculated = listNew.stream().filter(i -> i%15 ==0).map(i -> i+5).reduce(0 , (a,b) -> a+b);
		System.out.println("Calculated value: "+calculated);
	}

}
