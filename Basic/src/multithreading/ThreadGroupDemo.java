package multithreading;

public class ThreadGroupDemo implements Runnable 
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e) {
			
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThreadGroupDemo runnable = new ThreadGroupDemo();
		
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");
		
		Thread t = new Thread(tg1, runnable, "zero");
		t.start();
		Thread t1 = new Thread(tg1, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable, "two");
		t2.start();
		
		System.out.println("ThreadGroupName :"+tg1.getName()+t.getId());
		tg1.toString();
		tg1.list();
		
		

	}

}
