package collectionFramework;

import java.util.LinkedList;

public class LinkedListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> al = new LinkedList<String>();
		
		al.add("Tom");
		al.add("Jerry");
		al.add("Harry");
		
		System.out.println("After invoking add(E e) method :"+al);
		
		LinkedList<String> al1 = new LinkedList<String>();
		
		al1.add("Mike");
		al1.add("Tom");
		
		al.addAll(al1);
		
		System.out.println("After invoking add(E e) method :"+al);
		
		LinkedList<String> al2 = new LinkedList<String>();
		
		al2.add("Mary");
		al2.add("Mohan");
		
		al.addAll(2, al2);
		
		System.out.println("After invoking add(E e) method :"+al);
		
		al.addFirst("Bhavani");
		System.out.println("After invoking add(E e) method :"+al);
	}

}
