package collectionFramework;
import java.util.*;
public class StackPeekMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stack<String> stak = new Stack<String>();
       
       stak.push("Apple");
       stak.push("Grapes");
       stak.push("Mango");
       stak.push("Orange");
       
       System.out.println("Stack: "+stak);
       
       String fruits = stak.peek();
       System.out.println("Element at top: "+fruits);
       
       int location = stak.search("Mango");
       
       System.out.println("Location of Mango is :"+location);
       
       boolean e = stak.isEmpty();
       
       System.out.println("Is stack empty or not :"+e);
       
       int s = stak.size();
       
       System.out.println("Size: "+s);
	}

}
