package multi_threading;

public class Multithreading_demo {

	public static void main(String[] args) throws InterruptedException {
		MyThread obj = new MyThread();
		obj.start();
		Thread.sleep(3000);

		// System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

		// main thread
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("my thread");
			// Thread.yield();
		}
	}
}
