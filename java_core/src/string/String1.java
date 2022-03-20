package string;

public class String1 {

	public static void main(String[] args) {
		String a = "Java";
		int b = 10, c = 20, d = 30;

		System.out.println(a + b + c + d);

		System.out.println(b + c + d + a);

		System.out.println(b + c + a + d);

		System.out.println(b + a + c + d);

		// java execute statement form left to right
		// if + operator counter gets integer than it will add
		// if + operator counter gets string value it will act as a concatenation
		// after getting string it will act as a concatenation for the rest of the
		// execution

	}
}
