package preAndPost_increment;

public class pre_post {

	public static void main(String[] args) {

		// Pre-Increment
		int a = 5;
		System.out.println("value of a = " + ++a); // a becomes 6

		// Post-increment
		int b = 5;
		System.out.println("value of b = " + b++); // b becomes 5
		System.out.println("value of b2 = " + b++); // b2 becomes 6

		// Pre-decrement
		int c = 5;
		System.out.println("value of c = " + --c); // c becomes 6

		// Post-decrement
		int d = 5;
		System.out.println("value of d = " + d--); // d becomes 5
		System.out.println("value of d2 = " + d); // d2 becomes 4

		int e = 5, f = 5;
		e = e-- + f--;
		System.out.println("value of e = " + e); // e becomes 10
		System.out.println("value of f = " + f); // f becomes 4
	}
}
