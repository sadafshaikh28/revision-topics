package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentController {
	
	

	public static void main(String[] args) {
		
		List<Student> l1 = new ArrayList<Student>();
		
		l1.add(new Student(1,"Sachin","Math",57));
		l1.add(new Student(2,"Mohan","English",40));
		l1.add(new Student(3,"Mira","Math",79));
		l1.add(new Student(4,"Akash","Math",82));
		l1.add(new Student(5,"Jiya","Science",90));
		l1.add(new Student(6,"Reema","English",95));
		l1.add(new Student(7,"Mona","English",68));
		
		System.out.println("********************************ALL STUDENTS*******************************\n\n");
		
		for(Student e: l1)
		{
			System.out.println("id: "+ e.id + "		name: "+ e.name + "		course: "+ e.course +"		marks: "+ e.marks);
		}
		
		// l1.stream().forEach(System.out::println);
		System.out.println();
		
		//filter out students whose course is math						// s is just an object
		List<Student> MathList = l1.stream().filter(s -> s.getCourse().equalsIgnoreCase("Math")).collect(Collectors.toList());

		System.out.println("********************************MATH STUDENTS*******************************\n\n");
		for(Student e: MathList)
		{
			System.out.println("id: "+ e.id + "		name: "+ e.name + "		course: "+ e.course +"		marks: "+ e.marks);
		}
		
		
		//.map(s -> s.getMarks()+2.0)collect(Collectors.toList())
		// and increment math students marks by 2
		System.out.println();
		Double sumMath = MathList.stream().map(s -> (s.getMarks()+2.0)).reduce(0.0,(a,b) -> a+b);
		System.out.println("Average marks of math students after increment by 2 -");
		System.out.println((sumMath)/MathList.size());
		
		//average marks of all the math students
		//Double averageMathMarks = MathList.stream().map(s -> s.marks).reduce(0.0,(a,b) -> a+b);
		//System.out.println("\nAverage maths marks: "+averageMathMarks);
		
		/*System.out.println();
		List<Double> listInc = MathList.stream().map(s -> (s.getMarks()+2.0)).collect(Collectors.toList());
		for(Double e: listInc)
		{
			System.out.println(e);
		}
		 * 
		 * */
		
				
		// pipelined execution:
		double MathSum = l1.stream().filter(s -> s.getCourse().equalsIgnoreCase("Math")).map(s -> (s.getMarks()+2.0)).reduce(0.0,(a,b) -> a+b);
		System.out.println("\nAverage marks of math students after increment by 2 is " + (MathSum)/3.0 );

	}

}
