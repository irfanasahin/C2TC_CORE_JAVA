package arrays;

public class Arraydemo {
	public static void main(String[] args) {

//1. 2D array..
		int[][] x = new int[2][3];

		System.out.println(x);

		System.out.println(x[0]);

		System.out.println(x[0][0]);

		System.out.println(x[0][1]);

		System.out.println(x[1][0]);

		System.out.println(x[1][1]);

		System.out.println("----------------------");

//2. 3D array..
		int[][][] y = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80 }, { 90, 100, 110 } } };

		System.out.println(y[0][1][2]);
		System.out.println(y[1][1][2]);
		System.out.println(y[0][0][2]);
		System.out.println(y[1][1][1]);

		// java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2.
		// System.out.println(y[2][1][0]);
		// this index is not present in the array.
	}
}