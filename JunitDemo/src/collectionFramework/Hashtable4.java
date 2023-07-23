package collectionFramework;
import java.util.*;
public class Hashtable4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		
		map.put(100, "Amit");
		map.put(101, "Ravi");
		map.put(102, "Vijay");
		map.put(103, "Rahul");
		
		System.out.println(map.getOrDefault(101, "not found"));
		System.out.println(map.getOrDefault(105, "Not Found"));
	}

}
