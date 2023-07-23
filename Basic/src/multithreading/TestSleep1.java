package multithreading;

public class TestSleep1 extends Thread {
	
	public  void run() 
	{
		for(int i=0; i<5; i++)
		{
			try
			{
			  Thread.sleep(500);	
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleep1 t1 = new TestSleep1();
		TestSleep1 t2 = new TestSleep1();
		t1.start();
		t2.start();

	}

}
