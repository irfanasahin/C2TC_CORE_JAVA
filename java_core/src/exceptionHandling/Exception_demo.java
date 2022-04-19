package exceptionHandling;

public class Exception_demo {

	public static void main(String[] args) {
		/*
		 * if we don't want to create object for invoking the methods, then we need to
		 * declared that methods as a static method.
		 */
		m1();
	}

	static void m1() {
		m2();
	}

	static void m2() {
		try {
			System.out.println(101 / 0);
		} catch (ArithmeticException e) {
			System.out.println("can't divided by zero.");
			// we can directly print the exception object.
			System.out.println(e);
		}
	}

}
