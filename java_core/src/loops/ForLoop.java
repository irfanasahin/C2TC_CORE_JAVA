package loops;

public class ForLoop {

	public static void main(String[] args) {

//1.	 	infinite loop

//		for (;;) {
//			System.out.println("hi");
//		}

//2.
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
// output
//		@
//		@@
//		@@@
//		@@@@
//		@@@@@

//3.
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
// output
//		*****
//		****
//		***
//		**
//		*
	}
}
