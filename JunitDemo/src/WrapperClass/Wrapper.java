package WrapperClass;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		Integer i = Integer.valueOf(a); // explicitly
		Integer j = a; // internally 
        System.out.println(a+" "+i+" "+j);
	}

}
