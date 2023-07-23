package collectionFramework;
import java.util.*;

public class QueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer> q = new PriorityQueue ();
        Deque<Integer> q1 = new ArrayDeque ();
        
        q.add(1);
        q.add(2);
        q.add(5);
        q.add(6);
        
        q1.add(10);
        q1.add(20);
        q1.add(50);
        q1.add(60);
        q1.add(80);
        
        System.out.println("Head"+q.element());
        System.out.println("head"+q1.element());
        System.out.println("Head"+q.peek());
        System.out.println("head"+q1.peek());
        
        System.out.println("Iterating the elements");
        Iterator i = q.iterator();
        
        
        while(i.hasNext())
        {
        	System.out.println(i.next()); 
        }
        
       for(int  e: q1)
        {
        	System.out.println(q1);
        }
        
        
	}

}
