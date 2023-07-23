package collectionFramework;

import java.util.*;
public class ListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Kiwi");
		
		for(String fruit:list)
		{
			System.out.println(fruit);
		}

	}

}
