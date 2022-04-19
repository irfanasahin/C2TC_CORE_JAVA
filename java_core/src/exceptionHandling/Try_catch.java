package exceptionHandling;

public class Try_catch {

	public static void main(String[] args) {
		/*
		 * if risky code execute and we don't provide catch block then abnormal
		 * termination will occur.. if abnormal termination is occur then the program
		 * will stop there... so we are providing catch block.. As the exception has
		 * been caught in the catch block. then the normal execution is going on...
		 */
		System.out.println("first line");
		try {
			int b=5/0;
			System.out.println(5 / 5);
			System.out.println(5 / 0);
			return;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("out");
		
		

//		try {
//			int a[] = new int[5];
//			a[5] = 30 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println("task1 is completed");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("task 2 completed");
//		} catch (Exception e) {
//			System.out.println("common task completed");
//		}
//		System.out.println("rest of the code...");
	}
}