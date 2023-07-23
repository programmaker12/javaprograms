package ExceptionHandling1;

public class TryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try
       {
		int data = 10/0;
       }
       catch (Exception e)
       {
    	   System.out.println(e);
       }
       System.out.println("Hello Everyone");
	}

}
