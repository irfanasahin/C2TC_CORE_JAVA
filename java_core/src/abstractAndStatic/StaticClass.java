package abstractAndStatic;

import java.util.Scanner;

public class StaticClass {
	String name; // instance variable and object bound
	int adhar; // instance variable and object bound
	static String vaccine = "covidshield"; // static variable and class bound

	// parameterize constructor of StaticClass
	// it will call every time we create object
	public StaticClass(String anyname, int adhar) {
		this.adhar = adhar;
		this.name = anyname;
	}

	// we can change the value of static variable value with static method and need
	// to call it in the main method.
	static void changeStaticVariableValue() {
		vaccine = "covaxin";
	}

	void display() {
		System.out.println("your name is " + name + '\n' + "adhar number " + adhar + '\n' + "vaccine name " + vaccine);
	}

	public static void main(String[] args) {
		// we can directly call it or we can call with its class name
		StaticClass.changeStaticVariableValue();

		// StaticClass obj1 = new StaticClass("MyName", 12345);
		// obj1.display();

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter your name-");
		String str = sc1.nextLine();

		System.out.println("Enter your age-");
		int number = sc1.nextInt();

		StaticClass obj1 = new StaticClass(str, number);
		obj1.display();
	}
}