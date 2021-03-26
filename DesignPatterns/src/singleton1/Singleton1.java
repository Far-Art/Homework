package singleton1;

public class Singleton1 {
	private String message = "Hello world!";
	private static Singleton1 instance = null;

	private Singleton1() {
		System.out.println("CTOR IN ACTION");
	}

	public static Singleton1 getInstance() {
//		long startTime = System.nanoTime();
		if (instance == null) {
			synchronized (Singleton1.class) {
				if (instance == null) {
					instance = new Singleton1();
				}
			}
		}
//		long endTime = System.nanoTime();
//		System.err.println("Time was executed in nanos: " + (endTime - startTime));
		return instance;
	}

	public void printMessage() {
		System.out.println("Singleton1 message: " + instance.message);
	}
}
