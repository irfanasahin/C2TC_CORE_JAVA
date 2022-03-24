package overridingLoading;

public class MethodOverloading {
//	/* 
//	 * in method overloading signature can't be same............
//	 * method name can be same but not parameters...............
//	 * signature= method name + parameters
//	 */

	public void m() {
		System.out.println("no argument");
	}

	public void m(int i) {
		System.out.println("integer argument");
	}

	public void m(double d) {
		System.out.println("double argument");
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		// exact match with the method
		obj.m();
		obj.m(2);
		obj.m(4.67);

		// Automatic Promotion---
		obj.m('a'); // integer
		obj.m(2); // integer
		obj.m(102L); // double
		obj.m(5.6f); // double
	}

}
