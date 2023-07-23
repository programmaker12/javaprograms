package multithreading;

public class MyThread implements Runnable {
	
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(Thread.currentThread().getName()+"\t"+"i="+i);
			
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
