package Arrays;
import java.util.Scanner;
class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enterthe elements of first matrix 1");
        
        for (int i=0; i<2; i++)//row
        {
        	for (int j=0; j<2; j++)//column
        	{
        		a[i][j]=sc.nextInt();
        	}
        }
        System.out.println("Enterthe elements of second matrix 2");
        for (int i=0; i<2; i++)//row
        {
        	for (int j=0; j<2; j++)//column
        	{
        		b[i][j]=sc.nextInt();
        	}
        }
        System.out.print("-------- first matrix 1--------");
        System.out.println();
        for (int i=0; i<2; i++)//row
        {
        	for (int j=0; j<2; j++)//column
        	{
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.print("-------- second matrix 1--------");
        System.out.println();
        for (int i=0; i<2; i++)//row
        {
        	for (int j=0; j<2; j++)//column
        	{
        		System.out.print(b[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.print("-------- Addition of Matrix--------");
        System.out.println();
        for (int i=0; i<2; i++)//row
        {
        	for (int j=0; j<2; j++)//column
        	{
        		c[i][j]=a[i][j]+b[i][j];
        		System.out.print(c[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
