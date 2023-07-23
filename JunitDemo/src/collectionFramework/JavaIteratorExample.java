package collectionFramework;

import java.util.*;
public class JavaIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> a = new ArrayList<String>();
      
      a.add("Delhi");
      a.add("Mumbai");
      a.add("Kolkata");
      a.add("Chandigarh");
      a.add("Noida");
      
      Iterator iterator = a.iterator();
      
      System.out.println("a : ");
      
      while(iterator.hasNext())
      {
    	  System.out.println(iterator.next()+ " ");
      }
      }

}
