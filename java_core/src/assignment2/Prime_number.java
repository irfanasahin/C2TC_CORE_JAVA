package assignment2;

import java.util.Scanner;

//6.	WA Java Program to Check Prime Number.
public class Prime_number {

	public static void main(String[] args) {
//		Prime number is a number that is greater than 1 and divided by 1 or itself only.
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number-");
		double number = in.nextDouble();
		int temp = 0;

		if (number == 0 || number == 1) {
			temp = 1;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					temp = 1;
				}
			}
		}

		if (temp == 1)
			System.out.println(number + " is not a prime number");
		else
			System.out.println(number + " is a prime number");
	}

}
