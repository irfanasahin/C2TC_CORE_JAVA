package assignment2;

//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
//Diamond Pattern

public class Diamond_pattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		int k = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= k + 1; j++) {
				System.out.print(" ");
			}
			k++;
			for (int j = 1; j <= 2 * (4 - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}