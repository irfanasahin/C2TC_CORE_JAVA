package exceptionHandling;

public class Try_catch {

	public static void main(String[] args) {
		try {
			System.out.println(5 / 5);
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("out");
	}
	
}