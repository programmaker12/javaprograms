package multithreading;

public class ThreadDemo4 implements Runnable {
	
	public void run()
	{
		System.out.println("Now the thread is running.......");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj = new ThreadDemo4();
		Thread t1 = new Thread(obj);
		t1.start();
		
		/*String s = t1.getName();
		System.out.println(s);*/
        
	}

}
