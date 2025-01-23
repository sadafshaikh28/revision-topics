package multithreading;

public class CreateThread extends Thread {

	public static void main(String[] args) {
		
		CreateThread obj = new CreateThread();
		
		obj.start();
	}
	
	public void run()
	{
		System.out.println("Inside thread");
	}

}

//This method of thread creation is discouraged since now we cannot extend any other class that we might need (java does not support multiple inheritance).
