package multithreading;

class Priority extends Thread{  
	 public void run(){  
	   System.out.println("I'm thread : "+Thread.currentThread().getName());  
	   System.out.println("I'm thread :"+Thread.currentThread().getPriority());  
	  
	  }  
	 public static void main(String args[]){  
	  Priority t1=new Priority();  
	  Priority t2= new Priority();  
	  t1.setPriority(Thread.MIN_PRIORITY);  // setting priority of t1 thread to MIN_PRIORITY (1)
	  t2.setPriority(Thread.MAX_PRIORITY);  // setting priority of t2 thread to MAX_PRIORITY (10)
	  t1.start();  
	  t2.start();  
	   
	 }  
	}
