package prcatice;

import java.util.Iterator;

public class PracticeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Problem 1
		
	    String name = " Y a s h w a n t  ";
	 // Problem 1
		System.out.println(name.toLowerCase());
		// Problem 2
		System.out.println(name.toUpperCase());
		// Problem 3
		System.out.println(name.replace(" ", "_"));
		// Problem 4
		String letter = "Dear <|name|>, Thanks a lot";
		System.out.println(letter.replace("<|name|>", name));
		// Problem 5
		//char n[] = name.toCharArray();
		System.out.println(name.indexOf("  "));
		// Problem 6
		String letter1 = "Dear Harry, \n\tThis java course is nice \n Thanks";
		System.out.println(letter1);
		
		
		
	}

}
