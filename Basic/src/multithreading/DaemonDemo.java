package multithreading;

public class DaemonDemo extends Thread {
	
	public void run() 
	{
		if (Thread.currentThread().isDaemon()) 
		{
			System.out.println("Daemon thread working");
		}
		else
		{
			System.out.println("User thread working");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DaemonDemo t = new DaemonDemo();
        DaemonDemo t1 = new DaemonDemo();
        DaemonDemo t2 = new DaemonDemo();
        
        t.setDaemon(true);
        
        t.start();
        t1.start();
        t2.start();
	}

}
