package Arrays;

import java.util.Scanner;

public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[][] = new int[2][2];
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter array Elements :");
       for (int i=0; i<2; i++ )//column
       {
    	   for (int j=0; j<2; j++ )
    	   {
    		   a[i][j]=sc.nextInt();
    	   }
       }
        System.out.println("Matrix 1");
        for (int i=0; i<2; i++ )//column
        {
     	   for (int j=0; j<2; j++ )
     	   {
     		  System.out.print(a[i][j]); 
     	   }
     	  System.out.println(5); 
        }
       
	}

}
