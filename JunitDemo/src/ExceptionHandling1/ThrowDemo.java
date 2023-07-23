package ExceptionHandling1;
import java.util.Scanner;
public class ThrowDemo {
    static void checkAge(int age) throws ArithmeticException
    {
    	if(age < 18) {
        	throw new ArithmeticException("Access denied - you must be atleast 18 years old");
        }
        else {
        	System.out.println("Access granted ");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		checkAge(a);
        
	}

}
