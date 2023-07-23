package multithreading;

public class ThreadPriorityEx extends Thread
{
	public void run() 
	{
		System.out.println("Inside the run() method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriorityEx th = new ThreadPriorityEx();
		ThreadPriorityEx th1 = new ThreadPriorityEx();
		ThreadPriorityEx th2 = new ThreadPriorityEx();

		System.out.println("Priotity of the thread th is "+th.getPriority());
		System.out.println("Priotity of the thread th1 is "+th1.getPriority());
		System.out.println("Priotity of the thread th2 is "+th.getPriority());
		
		th.setPriority(6);
		th1.setPriority(6);
		th2.setPriority(6);
		
		System.out.println("Priotity of the thread th is "+th.getPriority());
		System.out.println("Priotity of the thread th1 is "+th1.getPriority());
		System.out.println("Priotity of the thread th2 is "+th2.getPriority());
		
		// main thread
		
		System.out.println("Currently executing the thread:"+Thread.currentThread().getName());
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(8);
		
		System.out.println("Priority of the main thread is :"+Thread.currentThread().getPriority());
		
		
		
		
	}

}
