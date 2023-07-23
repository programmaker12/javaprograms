package prcatice;
import java.util.Scanner;
public class PracticeSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem 1
		int a = 10;
	    if(a == 11)
	    {
	    	System.out.println("I am 11 \n ---------------------------------");
	    }
	    else
	    {
	    	System.out.println("I am not 11 \n ------------------------------");
	    }
	    
	    // Problem 2
	    byte m, m1, m2;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Physics subject marks");
	    m =  sc.nextByte();	    
	    System.out.println("Enter Maths subject marks");
	    m1 = sc.nextByte();
	    System.out.println("Enter Chemestry subject marks");
	    m2 = sc.nextByte();
	    
	    float average = (m+m1+m2)/3.0f;
	    if(average > 40 && m > 40 && m1 > 40 && m2 > 40)
	    {
	    	System.out.println("Congratulation, you are passed \n -----------------------------------");
	    }
	    else
	    {
	    	System.out.println("Sorry, you are not passed \n --------------------------------------------");
	    }
	    // Problem 3
	    
	    float s, salary, tax=0;
	    s = sc.nextFloat();
	    salary = s/100000;
	    System.out.println(salary);
	    if(salary<=2.5){
         tax = tax + 0;
            }
     else if(salary>2.5f && salary<= 5f){
         tax = tax + 0.05f * (salary - 2.5f);
     }
     else if(salary>5f && salary <= 10.0f){
         tax = tax + 0.05f * (5.0f - 2.5f);
         tax = tax + 0.2f * (salary - 5f);
     }
    else if(salary>10.0f){
         tax = tax + 0.05f * (5.0f - 2.5f);
         tax = tax + 0.2f * (10.0f - 5f);
         tax = tax + 0.3f * (salary - 10.0f);      }
	    
	    
	    System.out.println(tax);
	  
	  // Problem 4
	    
	    // Proble

    // Proble

	    // Problem 7
	    // Problem 8
	    // Problem 9
	    // Problem 10

	}

}
