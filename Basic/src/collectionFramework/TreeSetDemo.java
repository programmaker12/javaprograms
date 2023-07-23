package collectionFramework;
import java.util.*;


public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<String>();
		
		t.add("Darshan");
		t.add("Akash");
		t.add("Bunty");
		t.add("Chetak");
		t.add("Eknath");
		
		System.out.println("Initial Set :"+t);
		
		System.out.println("Reverse Set :"+t.descendingSet());
		
		System.out.println("Head Set :"+t.headSet("Darshan", true ));
		
		System.out.println("Tail Set :"+t.tailSet("Darshan", true));
		
		

	}

}
