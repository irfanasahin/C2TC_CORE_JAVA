package breakstatement;

public class Breakstatement {
	/*
	 * 1. break statement is applicable for switch and label block 2. break
	 * statement breaks the loop and directly come out of the loop
	 */

	public static void main(String[] args) {

//		for (int i=0; i<10; i++) {
//			if(i==5)
//				break;
//			System.out.println(i);
//			}

		int x = 10;

		switch (x) {
		case 10:
			System.out.println(10);
			break;
		case 18:
			System.out.println(18);
			break;

		default:
			System.out.println("Invalid");
			break;
		}
	}
}
