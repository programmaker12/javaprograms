package collectionFramework;
import java.util.*;
public class JavaDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deque<Integer> d = new ArrayDeque<Integer>();
        
        d.add(5);
        d.add(50);
        d.add(555*2);
        d.add(45);
        d.add(22);
        
        System.out.println("The elements are"+d);
        
        for(Integer i : d)
        {
        	System.out.println(i+"\n-----------------");
        }
        
       d.peek();
       System.out.println(d.peek());
       for(Integer i : d)
       {
       	System.out.println(i);
       }
	}

}
