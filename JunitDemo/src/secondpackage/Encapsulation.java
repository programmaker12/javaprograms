package secondpackage;
 
class Student5{  
	//private data member  
	protected String name = "Rohan";  
	//getter method for name  
	  String getName(){  
	return name;  
	}  
	//setter method for name  
    
	} 
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating instance of the encapsulated class  
		Student5 s=new Student5();  
		//setting value in the name member  
		//s.setName("vijay");  
		//getting value of the name member  
		System.out.println(s.getName());  
	}

}
