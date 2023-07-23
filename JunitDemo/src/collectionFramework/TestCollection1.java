package collectionFramework;

import java.util.*;

public class TestCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Queue<String> queue = new PriorityQueue<String>();
	    
	    queue.add("Roger");
	    queue.add("Sakshi");
	    queue.add("Irfan");
	    queue.add("Prajwal");
	    queue.add("Priya");
	    
	    //System.out.println("Head "+queue.element());
	    //System.out.println("head "+queue.peek());
	    
	    System.out.println("Iterator the queue elements");
	    
	    Iterator<String> i = queue.iterator();
	    
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }

	}

}
