package continuestatement;

public class Continue_demo {

	/*
	 * 1. continue statement only used in loop and applicable for iterative
	 * statement 2. it will skip current iteration and continue with the next
	 * iteration
	 */

	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			if(i%2==0)
//				continue;
//			System.out.println(i);
//		}

		int x = 0;
		do {
			x++;
			System.out.println(x);
			if (++x < 5)
				continue;
			x++;
			System.out.println(x);
		} while (++x < 10);
	}
}