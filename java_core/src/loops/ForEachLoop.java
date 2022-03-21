package loops;

public class ForEachLoop {

	public static void main(String[] args) {
//		declaring array
		int[] arr = { 1, 2, 4, 5, 6 };

//		For loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

//		ForEach loop
		for (int anyname : arr) {
			System.out.print(anyname + " ");
		}
	}
}
