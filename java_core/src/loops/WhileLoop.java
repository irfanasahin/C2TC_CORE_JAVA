package loops;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++; // if we not increment this then the loop will never end
		}

		int a = 10;
		final int b = 20;
// 		both a and b can't be final, then we will not able to increment any of them and infinite loop will execute

		while (a < b) {
			System.out.println("a");
			a++;
		}
// 		outside infinity loop code will never execute i.e unreachable code
		System.out.println("b");
	}
}