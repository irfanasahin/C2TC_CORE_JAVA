package assignment2;

import java.util.Scanner;

//3.	WA Java Program to Check Armstrong Number.
public class Armstrong_number {

	public static void main(String[] args) {
		// Armstrong number is a number that is equal to the sum of cubes of its digits.

		int number, sum = 0, rem, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number- ");
		number = sc.nextInt();
		temp = number;

		while (number > 0) {
			rem = number % 10;
			sum = sum + (rem * rem * rem);
			number = number / 10;
		}

		if (sum == temp)
			System.out.println(temp + " is a armstrong number. ");
		else
			System.out.println(temp + " is not a armstrong number. ");

	}

}
