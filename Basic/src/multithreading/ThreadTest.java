package multithreading;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable obj = new MyThread();
        
        Thread t1 = new Thread(obj, "T1");//Thread(Runnable r, String name)
        Thread t2 = new Thread(obj, "T2");
        
        /*t1.start();
        t2.start();*/
        
        t1.run();
        t2.run();
        
	}

}
