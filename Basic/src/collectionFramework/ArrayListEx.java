package collectionFramework;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Avenger");
		list.add("KTM");
		list.add("YEZDI");
		list.add("JAWA");
		list.add("BMW");
		
		/*Iterator i = list.iterator();
        System.out.println(list);
        while(i.hasNext()){  
        	System.out.println();  
        	} */
	      System.out.println(list.get(2));
	      list.set(2, "Honda");
		for(String bikes:list)
		{
			System.out.println(bikes);
		}
        
	}

}
