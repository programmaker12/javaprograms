package prcatice;


public class PracticeSet7 {
	
	//Problem 1
	
	void table(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}
	
	void pattern ()
	{
		for(int i=0; i<5; i++ )
		{
			for(int j=0; j<=i; j++)
			{
		      System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	static int sumofnumbers(int n)
	{   
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+sumofnumbers(n-1);
		}
		
	}
	
	void pattern1()
	{
		for(int i=0; i<5; i++ )
		{
			for(int j=i; j<=5; j++)
			{
		      System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	static int fibno(int n)
		{
			if (n==1 || n==2) {
				return n-1;
				
			} else {
				return fibno(n-1)+fibno(n-2);

			}
		}
	
   void average (int n[])
   { 
	   int sum = 0;
	   for (int i=0; i<n.length; i++)
	   {
		   sum+=n[i];
	   }
	   System.out.println("Average is "+sum/n.length);
   }

    static void patternrecurs(int n)
    {
    	if(n>0)
    	{
    		patternrecurs(n-1);
    		for(int i=n; i>0; i--)
    		{
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	
    }
    
    static int patternrecurs(int n, int e)
    { 
    	if(n>0)
    	{
    		patternrecurs(n+1);
    		for(int i=0; i<n; i++)
    		{
    			System.out.print("* ");
    		}
    		System.out.println();
    	}
    	return 1;
    	
    }
    
    void convert (int n)
    {
    	int f = n*9/5 + 35;
    	System.out.println(f);
    }
    
    void iterative(int n)
    { 
    	int sum = 0;
    	for(int i=0; i<=n; i++)
    	{
    		sum+=i;
    	}
    	System.out.println("The sum is "+sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeSet7 p = new PracticeSet7();
		/*p.table(10); */
		
		// Problem 2
		
		p.pattern();
		
		// Problem 3
		
		int a = sumofnumbers(5);
		System.out.println(a);
		
		// Problem 4
		
		p.pattern1();
		
		// problem 5
		
		//int b = fibno(7);
		//System.out.println(b);
		/*for (int i = 0; i < 7; i++) {
			 
            System.out.print(fibno(i) + " ");
        }*/
		
		// Problem 6 
		int setofn [] = {5, 2, 1, 10, 6, 8};
		p.average(setofn);
		
		// problem 7
		p.patternrecurs(5);
		// problem 8
		p.patternrecurs(5, 5);
		// problem 9
		p.convert(10);
		// problem 10
		p.iterative(5);
		
		
		
		
		
		
		
		
		
		
		

	}

}
