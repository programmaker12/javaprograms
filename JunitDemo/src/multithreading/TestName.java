package multithreading;

public class TestName extends Thread {
	
	public void run()
	{
		System.out.println("Running.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TestName t=new TestName();
        TestName t1=new TestName();
        
        System.out.println("name of t1 :"+t.getName());
        System.out.println("name of t2 :"+t1.getName());
        
        t1.setName("Harsh");
        System.out.println("After changing name of t1 :"+t1.getName());
        
        t.start();
        t1.start();
       
	}

}
