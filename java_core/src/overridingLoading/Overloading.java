package overridingLoading;

class Add {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public void add(float a, float b, float c) {
		System.out.println(a + b + c);
	}
}

public class Overloading {

	public static void main(String[] args) {
		Add a = new Add();
		a.add(4, 50);
		a.add(5, 6, 7);
		a.add(5.4f, 6.5f, 1.2f);
	}
}
