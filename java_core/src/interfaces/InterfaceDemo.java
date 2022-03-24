package interfaces;

/*
 * interface are use to implement abstraction in java
 * it contains abstract method only
 */
interface One {
	void display_A();  // abstract method
}

interface Two {
	void display_B();
}

class AB implements One, Two {
	public void display_A() {
		System.out.println("i am interface one...");
	}

	public void display_B() {
		System.out.println("i am interface two...");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		AB obj = new AB();
		obj.display_A();
		obj.display_B();
	}
}
