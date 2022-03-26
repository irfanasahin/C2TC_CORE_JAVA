package assignment2;

//* * * * * *
//  * * * * 
//   * * * 
//    * * 
//     * 			
//Reverse Pyramid

import java.util.Scanner;

public class Reverse_pyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("how many row do you want to print-- ");
		int number = input.nextInt();

		int space = 1;
		for (int i = 0; i <= number; i++) {
			for (int j = 1; j <= space + 1; j++) {
				System.out.print(" ");
			}
			space++;

			for (int j = 1; j <= 2 * (number - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
