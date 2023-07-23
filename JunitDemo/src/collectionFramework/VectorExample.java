package collectionFramework;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vector<String> vect = new Vector<String>();
     
     vect.add("Tiger");
     vect.add("Lion");
     vect.add("Elephant");
     
     
     
     // Adding elements using addElements () method of Vector
     
     vect.addElement("Rat");
     vect.addElement("Cat");
     vect.addElement("Doer");
     
     System.out.println("Elements are: "+vect);
     // VectorExample 1  
     System.out.println("Size :"+vect.size());
     System.out.println("Default capacity is: "+vect.capacity());
     
     // VectorExample 2
     if(vect.contains("Tiger"))
     {
    	 System.out.println("It is present at the index of "+vect.indexOf("Tiger"));
     }
     else
     {
    	 System.out.println("It is not present");
     }
     
     System.out.println("First element: "+vect.firstElement());
     System.out.println("Last element: "+vect.lastElement());
     
	}

}
