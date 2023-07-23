package secondpackage;
 
public class Overload {
void sum () {
	System.out.println("Nothing is there");
}
void sum (int a, int b) {
	System.out.println(a+b);
}
void sum (double a, double b) {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Overload o = new Overload();
      o.sum(5,6.5);
      o.sum(56,66.5);
      
      
	}

}
