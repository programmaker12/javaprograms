package prcatice;
class Cylinder
{

	private int radius;
	private int height;
	
	Cylinder(int r, int h)
	{
		this.radius = r;
		this.height = h;
	}
	public int getRadius ()
	{
		return radius;
	}
	
	public void setRadius (int r)
	{
		this.radius = r;
	}
	public int getHeight ()
	{
		return height;
	}
	
	public void setHeight (int h)
	{
		this.height = h;
	}
	
	
	void Calculate () 
	{
	 System.out.println("The surface area is "+2*3.14*radius*height);
	 System.out.println("The volume of cylinder is "+3.14*radius*radius*height);
	}
}
	
	 class Trapezium 
	{
		 private int length;
		 private int breadth;
		
		
		 Trapezium (int length,int breadth)
		{
			this.length = length;
			this.breadth = breadth;
		}
		
		int getLength()
		{
		 return length;	
		}
		
		int getBreadth()
		{
			return breadth;	
		}
		
		void Calculate()
		{
			System.out.println("The perimeter of the rectangle is "+2*(length+breadth));
			System.out.println("The area of the reactangle is "+ length*breadth);
		}
		
		
		
	}
	 
 class Sphere
 {
	 private int radius;
	 
	 public int getRadius()
	 {
		 return radius;
	 }
	 
	 void setRadius(int r)
	 {
		 this.radius = r;
	 }
	 
	 
 }
 
 class Rectangle{
	    private int length;
	    private int breadth;

	    public Rectangle() {
	        this.length = 4;
	        this.breadth = 5;
	    }

	    public Rectangle(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	    public int getLength() {
	        return length;
	    }

	    public int getBreadth() {
	        return breadth;
	    }
	}

public class PracticeSet9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c = new Cylinder(5, 10);
		
		c.setHeight(5);
		c.setRadius(4);
		// problem 2
		c.Calculate();
		// Problem 3
		Trapezium r = new Trapezium(5 , 5);
		r.Calculate();
		// Problem 4
		Rectangle r1 = new Rectangle(10, 20);
		System.out.println(r1.getBreadth());
		System.out.println(r1.getLength());
		
	
		
	}

}
