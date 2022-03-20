package arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int arr_1[] = new int[3]; // we need to provide the base size when we declare an array

		// Inserting values in array
		arr_1[0] = 2;
		arr_1[1] = 3;
		arr_1[2] = 100;

		// Declaring array directly
		int arr_2[] = { 5, 6, 9, 9 };

		// Foreach loop for printing the elements of the array
		for (int elements : arr_1) {
			System.out.print(elements);
		}
		for (int elements : arr_2) {
			System.out.print(elements);
		}
	}
}
