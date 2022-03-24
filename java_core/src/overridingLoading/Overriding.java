package overridingLoading;

public class Overriding {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.xyz();

		Parent obj2 = new Parent();
		obj2.xyz();
		
		Parent obj3 = new Child();
		obj3.xyz();
	}
}

class Parent {
	void xyz() {
		System.out.println("i am super class xyz");
	}

//	final method can't be overridden.
	final void abc() {
		System.out.println("i am super class abc");
	}
}

class Child extends Parent {

//	this is overriding method.
	void xyz() {
		System.out.println("i am overriding xyz");
	}
}