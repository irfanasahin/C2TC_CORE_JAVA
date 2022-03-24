package string;

//import java.io.*;

public class StringBuffer_demo {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("eclipse");
		System.out.println(str);

		// length of the string
		System.out.println(str.length());

		// the total allocated capacity of the string
		System.out.println(str.capacity());

		// concatenation
		System.out.println(str.append("IDE"));

		// reverse the characters of the object str.
		System.out.println(str.reverse());

		// inserting text at the specified index position.
		System.out.println(str.insert(0, "Hi"));

		// hash code value for this object.
		System.out.println(str.hashCode());

		// replacing str
		System.out.println(str.replace(5, 8, "xxx"));
		System.out.println(str.replace(5, 8, "xxxx"));

	}

}
