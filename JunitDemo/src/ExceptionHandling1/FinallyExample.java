package ExceptionHandling1;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{   
			System.out.println("Inside the try block");
			int data = 5/0;
			System.out.println(data);
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e+"Inside");
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}

	}

}
