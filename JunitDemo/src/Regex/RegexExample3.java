package Regex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
        while(true)
        {
        	System.out.println("Enter the regex pattern :");
        	Pattern pattern = Pattern.compile(sc.nextLine());
        	System.out.println("Enter the text :");
        	Matcher matcher = pattern.matcher(sc.nextLine());
        	boolean found = false;
        	
        	if(matcher.find())
        	{
        		System.out.println("I found the text "+matcher.group()+" starting at index "+matcher.start()
        		+" and ending at index "+matcher.end());
        	}
        	else
        	{
        		System.out.println("No match found");
        	}
        	System.out.println(matcher.group());
        }
	}

}
