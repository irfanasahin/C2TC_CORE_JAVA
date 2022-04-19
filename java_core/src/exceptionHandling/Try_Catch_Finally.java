package exceptionHandling;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
			System.out.println(5 / 5);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
//	only one finally block for each try block.
			System.out.println(25 / 5);
		}

	}

}
