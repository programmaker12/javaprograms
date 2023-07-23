package Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [][]jaggedArray=
    	   {
    			   {1,2,3}, //first row
    			   {4,5}, // second row two columns
    			   {6, 7, 8, 9}// third row has four columns
    	   };
       for(int i=0; i<jaggedArray.length; i++)//rows
       {
    	   for(int j=0; j<jaggedArray[i].length; j++)
    	   {
    		   System.out.print(jaggedArray[i][j]+" ");
    	   }
    	   System.out.println();
       }
	}

}
