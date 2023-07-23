package collectionFramework;

import java.util.*;
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();//Creating array list  
		LinkedList<String> list1 = new LinkedList<String>();
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list1.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();
		Iterator i = list1.iterator();
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		
		}
		System.out.println(list1);
		while(i.hasNext()){  
			System.out.println(i.next());
			
			}
	}

}
