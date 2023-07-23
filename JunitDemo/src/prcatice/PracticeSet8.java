package prcatice;

class Employee 
{
int salary;
String name;
  int getSalary()
 {
	return salary; 
 }
  
  public String getName()
  {
	  return name;
  }
  
  void setName(String n)
  {
	 name = n; 
  }
}

class CellPlhone 
{
	void ring()
	{
		System.out.println("Ringing......");
	}
	
	void vibrate()
	{
		System.out.println("Vibrating......");
	}
}

class Square 
{  int side;
   void Side (int s) 
   {
	   side = s;
   }
   
   void Area ()
   {
	   System.out.println("The area of square is "+side*side);
   }
   
   void Perimeter()
   {
	   System.out.println("The perimeter of the square is "+4*side);
   }
	 
}

 /*class Rectangle
{ 
	 int length, breadth;
	 
	 
	   void Side (int l, int b) 
	   {
		   length = l;
		   breadth = b;
	   }
	   public Rectangle(int l, int b)
	 {
		 this.length = l;
		 this.breadth = b;
	 }
	   
	   void Area ()
	   {
		   System.out.println("The area of rectangle is "+length*breadth);
	   }
	   
	   void Perimeter()
	   {
		   System.out.println("The perimeter of the rectangle is "+2*(length+breadth));
	   }
}*/
 
 class TommyVecitte 
 {
	 void hit ()
	 {
		 System.out.println("hitting......");
	 }
	 
	 void run ()
	 {
		 System.out.println("running......");
	 }
	 
	 void fire()
	 {
		 System.out.println("firing");
	 }
 }
 
 class Circle 
 {
	 int radius;
	   void Radius (int s) 
	   {
		   radius = s;
	   }
	   
	   void Area ()
	   {
		   System.out.println("The area of circle is "+3.14*radius*radius);
	   }
	   
	   void circumference()
	   {
		   System.out.println("The circumference of the circle is "+2*3.14*radius);
	   }
 }
public class PracticeSet8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle a = new Circle();
        a.Radius(5);
        a.Area();
        a.circumference();
        Rectangle r = new Rectangle(5, 10);
        /*r.Side(10, 20);
        r.Area();
        r.Perimeter();*/
	}

}
