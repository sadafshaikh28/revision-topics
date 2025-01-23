package multithreading;

public class CreateThread2 implements Runnable

{

	public static void main(String[] args) {
		
		CreateThread2 obj = new CreateThread2();
		
		Thread t1= new Thread(obj);
		
		t1.start();		

	}

	@Override
	public void run() {
		
		System.out.println("Inside thread");
		
	}

}
