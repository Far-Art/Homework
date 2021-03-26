package singleton1;

public class TestSingleton {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("***************************\n       Singleton1 Demo \n***************************");
		new Thread(() -> Singleton1.getInstance().printMessage()).start();
		new Thread(() -> Singleton1.getInstance().printMessage()).start();
		new Thread(() -> Singleton1.getInstance().printMessage()).start();

		Thread.sleep(100); // to let the anonymous threads finish execution
		
		System.out.println("\n***************************\n       MyEnum Demo \n***************************");
		MyEnum enum1 = MyEnum.INSTANCE1;
		MyEnum enum2 = MyEnum.INSTANCE1;

		enum1.printMessage();
		enum2.printMessage();

		System.out.println("\nChange enum1 message to \"Hello World!\"\n");
		enum1.message = "Hello World!";

		enum1.printMessage();
		enum2.printMessage();
	}

}
