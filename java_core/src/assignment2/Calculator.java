package assignment2;

import java.util.Scanner;

//4.	WA Java Program to Make a Simple Calculator Using switch...case.
public class Calculator {

	public static void main(String[] args) {

		double result;
		Scanner sn = new Scanner(System.in);

		System.out.println("Enter the operator ");
		char operator = sn.next().charAt(0);

		System.out.println("Enter the first number= ");
		double first = sn.nextDouble();

		System.out.println("Enter the second number= ");
		double second = sn.nextDouble();

		switch (operator) {
		case '+':
			result = first + second;
			System.out.println("The sum of " + first + " and " + second + " is " + result);
			break;
		case '-':
			result = first - second;
			System.out.println("The subtraction of " + first + " and " + second + " is " + result);
			break;
		case '*':
		case '.':
			result = first * second;
			System.out.println("The multiplication of " + first + " and " + second + " is " + result);
			break;
		case '/':
			result = first + second;
			System.out.println("The sum is = " + first + " and " + second + " is " + result);
			break;
		default:
			System.out.println("Invalid operator.. ");
			break;
		}

	}

}
