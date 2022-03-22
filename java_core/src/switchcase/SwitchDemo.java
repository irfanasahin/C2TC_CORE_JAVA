package switchcase;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {

//		int x=10;
//		switch(x)
//		{
//		case 'a':
//			System.out.println("a");
//			break;
//			
//		case 97:
//			System.out.println("97");
//			break;
//		}
//		duplicate value

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number- ");
			int a = sc.nextInt();

			switch (a) {
			case 0:
				System.out.println("0");
				break;

			case 1:
				System.out.println("1");

			case 2:
				System.out.println("2");

			case 3:
				System.out.println("3");
				break;

			default:
				System.out.println("default statement");
			}
		}

	}

}
