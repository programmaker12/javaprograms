package collectionFramework;
import java.util.*;
public class Hashtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(100, "Amit");
		map.put(101, "Ravi");
		map.put(102, "Vijay");
		map.put(103, "Rahul");
		
		System.out.println("Before remove: "+map);
		map.remove(102);
		System.out.println("After remove: "+map);
	}

}
