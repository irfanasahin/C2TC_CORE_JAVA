package assignment2;

//5.	WA Java Program to Determine the name and version of the operating system.
public class VersionOfOS {

	public static void main(String[] args) {

		System.out.print("The Name of the Operating System: ");
		System.out.println(System.getProperty("os.name"));

		System.out.print("The version of the Operating System: ");
		System.out.println(System.getProperty("os.version"));

//		all listing properties of the system
//		System.getProperties().list(System.out);
	}
}
