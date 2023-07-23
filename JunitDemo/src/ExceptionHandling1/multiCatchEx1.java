package ExceptionHandling1;

public class multiCatchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{   int b = 5/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
        catch(ArrayIndexOutOfBoundsException e) 
		{
        	System.out.println("Array Index Out Of Bounds Exception");
		}
        catch(NullPointerException e) 
		{
        	System.out.println("Null Pointer Exception occurs");
		}
		try
		{
			int a[]=new int[5];
			System.out.println(a[10]);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
        catch(ArrayIndexOutOfBoundsException e) 
		{
        	System.out.println("Array Index Out Of Bounds Exception");
		}
        catch(NullPointerException e) 
		{
        	System.out.println("Null Pointer Exception occurs");
		}
	 System.out.println("rest of the code");			

	}

}
