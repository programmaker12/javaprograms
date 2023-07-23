package secondpackage;

class Student {
	int id=5;
	String name="Rohan"; // instance variable
	void show () {
		
		System.out.println("This is a nice student");
	}
	void insertRecord(int i, String n) {
		id = i;
		name = n;
	}
	void displayInformation () {
		System.out.println(id+" "+name);
	}
	}
public class OOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		s.show();
		System.out.println(s.id +" "+ s.name);
		s1.id = 6;
		s1.name = "Sania";
		System.out.println(s1.id +" "+ s1.name);
		
		System.out.println("Student details are :");
		s1.insertRecord(56, "Ranvir");
		s2.insertRecord(66, "Pratap");
		s1.displayInformation();
		s2.displayInformation();
		
		
		
		

	}

}
