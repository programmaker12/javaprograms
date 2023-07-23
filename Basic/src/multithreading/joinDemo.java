package multithreading;

public class joinDemo extends Thread {
	
	public void run()
	{
		String name = Thread.currentThread().getName();
		
		for(int i=1; i<=3; i++)
		{
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        joinDemo t = new joinDemo();
        joinDemo t1 = new joinDemo();
        joinDemo t2 = new joinDemo();
        
        t.setName("Thread ");
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        
        t1.start();
        try
        {
        	t1.join();
        }
        catch(InterruptedException e)
        {
        	System.out.println(e);
        }
        
        t.start();
        t2.start();
        
        String name=Thread.currentThread().getName();
        for(int i=1; i<=3; i++)
        {
        	System.out.println(name);
        }
	}

}
