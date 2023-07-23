package secondpackage.Inheritance;

class Animal {
	void eat () {
		System.out.println("eating......");
	}	
}
class Dogs extends Animal {
	void bark () {
		System.out.println("barking......");
	}
}
class BabyDogs extends Dogs {
	void weep() {
	System.out.println("weeping......");
	}
}
class Cat extends Animal {
	void meow() {
		System.out.println("meowing......");
	}
}

class Rabbit {
	void purr () {
		System.out.println("purring.......");
	}
}


public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BabyDogs a = new BabyDogs();
        Cat b = new Cat();
        a.eat();
        a.bark();
        a.weep();
        b.eat();
        b.meow();
        
	}

}
