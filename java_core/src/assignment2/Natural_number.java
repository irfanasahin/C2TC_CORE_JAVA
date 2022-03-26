package assignment2;

import java.util.Scanner;

//2.	WA Java Program to Calculate the Sum of Natural Numbers.
public class Natural_number {

	public static void main(String[] args) {
		int num, sum = 0, i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you want to calculate sum ");
		num = sc.nextInt();

		while (num >= i) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of the natural number upto " + num + " is " + sum);
	}

}