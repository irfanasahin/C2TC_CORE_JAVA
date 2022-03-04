package java_core;

public class Student {

	String name;
	int age, roll;
	
	public Student (String name, int roll, int age) {
		this.name= name;
		this.roll=roll;
		this.age=age;
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Student s1= new Student("myname",1,22);
	Student s2= new Student("xyz",2,32);

	System.out.println(s1.name+" "+s1.roll+" "+s1.age);
	System.out.println(s2.name+" "+s2.roll+" "+s2.age);
}

}
