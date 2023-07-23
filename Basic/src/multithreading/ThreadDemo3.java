package multithreading;

public class ThreadDemo3 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Thread t = new Thread("My first thread");
         t.start();
         String str = t.getName();
         System.out.println(str);
	}

}
