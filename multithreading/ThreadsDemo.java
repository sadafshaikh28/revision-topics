package multithreading;

public class ThreadsDemo {

	public static void main(String[] args) {
		
		A objA = new A();
		B objB = new B();
		
		objA.start();
		objB.start();
		
	}

}


class A extends Thread
{
	public void run() 
	{
		for(int i=1 ; i<6 ; i++)
		{
			System.out.println("Inside thread A");
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1 ; i<6 ; i++)
		{
			System.out.println("Inside thread B");
		}
	}
}

