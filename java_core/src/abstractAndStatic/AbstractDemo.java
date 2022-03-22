package abstractAndStatic;

// abstract class
abstract class Abstract_demo {

	// abstract methods
	abstract void methodA();

	abstract void methodB(int num1, int num2);

	void methodC() {
		System.out.println("Instances method");
	}
}

// inheriting abstract class
class Implement_demo extends Abstract_demo {

	void methodA() {
		System.out.println("Hi i am methodA");
	}

	void methodB(int num1, int num2) {
		System.out.println("Hi i am methodB" + " " + num1 + " " + num2);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {

		Implement_demo obj = new Implement_demo();

		obj.methodA();
		obj.methodB(5, 7);

		// We can use the reference of abstract class to create objects of other class.
		Abstract_demo obj2 = new Implement_demo();
		obj2.methodA();
	}
}