package Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][] = new int [2][2];
		int b[][] = {
				{1,2,3}, //first row
 			   {4,5}, // second row two columns
 			   {6, 7, 8, 9}// third row has four columns
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix elements:");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("------Matrix1------");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------Matrix2------");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}

	}

}
