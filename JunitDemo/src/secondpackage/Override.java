package secondpackage;

class Ramesh {
	void salary () {
		System.out.println("Salary is 5000");
	}
}

class Suresh extends Ramesh {
	void salary () {
		System.out.println("Salary is 10000");
	}
}

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Suresh s = new Suresh();
     s.salary();
	}

}
