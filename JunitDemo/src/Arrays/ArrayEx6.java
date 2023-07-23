package Arrays;
import java.util.Scanner;
public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] =new int[5];
       int sum=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the elements in array:");;
       for (int i = 0; i<a.length; i++)
       {
    	   a[i]=sc.nextInt();
    	   
       }
       System.out.println("Array elements ;");
       
       for (int i=0; i<a.length; i++)
       {
    	   System.out.println(a[i]+" ");
    	   sum=a[i]+sum;
       }
       System.out.println("Addition of Array is");
	}

}
