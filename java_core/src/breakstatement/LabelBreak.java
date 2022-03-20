package breakstatement;

public class LabelBreak {

	public static void main(String[] args) {
		int x = 100;
		// labeled block
		l: {
			System.out.println("start");
			if (x == 10)
				// if x 100 then control will out from the loop
				break l;

			System.out.println("end");
		}
		System.out.println("hi again");
	}
}
