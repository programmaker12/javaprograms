package multithreading;

public class ThreadDemo1 extends Thread {
	
	public void run() 
	{
		System.out.println("Thread is running......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 obj = new ThreadDemo1();
		obj.start();

	}

}
