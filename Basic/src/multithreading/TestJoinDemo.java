package multithreading;

public class TestJoinDemo extends Thread {
	
	public void run()
	{
		for(int i=1; i<+5;i++)
		{
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJoinDemo t = new TestJoinDemo();
		TestJoinDemo t1 = new TestJoinDemo();
		TestJoinDemo t2 = new TestJoinDemo();
		
		t1.start();
		
		try 
		{
			t1.join(50000);
		}
		catch (InterruptedException e) 
		{
			System.out.println(e);
		}
		t.start();
		t2.start();
	}

}
