package streamApi;

public class Student {
	
	int id;
	String name;
	String course;
	double marks;
	
	Student(int id,String name,String course,double marks)
	{
		this.id=id;
		this.name=name;
		this.course=course;
		this.marks=marks;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	
	public static void main(String[] args) {
		

	}

}
