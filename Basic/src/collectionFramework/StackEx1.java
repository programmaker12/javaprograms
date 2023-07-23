package collectionFramework;
import java.util.*;
public class StackEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stack<Integer> s = new Stack<Integer>();
        // Adding elements
        s.push(5);
        s.push(4);
        s.push(2);
        s.push(1);
        s.push(6);
        s.push(8);
        s.add(null);
        //s.pop();
        s.peek();
        
        
        
        // Output
        
        Iterator i = s.iterator();
        
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
	}

}
