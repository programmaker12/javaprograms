package collectionFramework;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(100, "Amit");
		map.put(101, "Ravi");
		map.put(102, "Vijay");
		map.put(105, "Rahul");
		
		System.out.println("Initial Map: "+map);
		
		map.putIfAbsent(104, "Gaurav");
		System.out.println("Updated Map: "+map);
		
		map.putIfAbsent(101,  "Peter");
		System.out.println("Updated Map: "+map);
	}

}
