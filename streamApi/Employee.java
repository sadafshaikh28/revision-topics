package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	
	int id;
	String name;
	int salary;
	String dept;
	
		

	public Employee(int id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}



	public static void main(String[] args) {
		
		Employee obj1 = new Employee(1,"John",15000,"Admin");
		Employee obj2 = new Employee(2,"Edward",10000,"IT");
		Employee obj3 = new Employee(3,"Jack",5000,"Staff");
		Employee obj4 = new Employee(4,"Nona",12000,"IT");
		
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(obj1);
		employee.add(obj2);
		employee.add(obj3);
		employee.add(obj4);
		employee.add(new Employee(5,"Juliet",15000,"HR"));
		
		for(Employee e : employee)
		{
			System.out.println("id: "+ e.id + "	Name: "+ e.name + "	Salary: "+ e.salary + "	Department: "+e.dept);		
		}
		
		//filter employees name starting with J
		
		List<Employee> employeeListNew = employee.stream().filter((e -> e.name.startsWith("J"))).collect(Collectors.toList());
		
		System.out.println("\nEmployees starting with J\n");
		
		for(Employee e : employeeListNew)
		{
			System.out.println("id: "+ e.id + "	Name: "+ e.name + "	Salary: "+ e.salary + "	Department: "+e.dept);		
		}
		
		
		
		
	}

}
