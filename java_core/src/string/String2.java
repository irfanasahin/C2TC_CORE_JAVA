package string;

public class String2 {

	public static void main(String[] args) {
		String s = "harry potter";
		System.out.println(s.length());

		String upper = s.toUpperCase();
		System.out.println(upper);

		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 6));
	}

}
