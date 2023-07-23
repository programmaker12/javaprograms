package multithreading;

public class TestSleep2   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		for(int i=0; i<5; i++)
		    {
			  Thread.sleep(1000);
			  System.out.println(i);
		    }
		}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
	}

}
