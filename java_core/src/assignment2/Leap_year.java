package assignment2;

import java.util.Scanner;

//		1.	WA Java Program to check whether the entered year is a leap year or not?
public class Leap_year {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year- ");
		int year = scan.nextInt();

		/*
		 * A leap year is exactly divisible by 4 except for century years (years ending
		 * with 00). The century year is a leap year only if it is perfectly divisible
		 * by 400.
		 */

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is a leap year.");
		} else if (year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		} else
			System.out.println(year + " is not a leap year.");
	}

}
