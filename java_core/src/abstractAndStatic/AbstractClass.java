package abstractAndStatic;

abstract class AbstractParent {
	// Abstract class constructor.
	AbstractParent(String str) {
		System.out.println("this is abstract class constructor" + " " + str);
	}
}

//Inheriting abstract class in AbstractChild class.
class AbstractChild extends AbstractParent {

	AbstractChild(String str) {
		super(str);
		System.out.println("Derived class constructor" + " " + str);
	}

	public void methodMe() {
		System.out.println("no argument");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		AbstractChild obj = new AbstractChild("i am coming form main");
		obj.methodMe();
	}

}