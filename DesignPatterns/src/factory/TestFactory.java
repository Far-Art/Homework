package factory;

public class TestFactory {
	public static void main(String[] args) {
		System.out.println("*** Hard coded iphone ***");
		Smartphone smartphone = new Iphone();
		smartphone.browse();
		smartphone.os();

		System.out.println();

		System.out.println("*** samsung with factory param ***");
		SmartphoneFactory factory = new SmartphoneFactory();
		Smartphone smartphone2 = factory.getSmartphone("samsung");
		smartphone2.browse();
		smartphone2.os();

		System.out.println();

		System.out.println("*** smartphone with args[0] param ***");
		Smartphone smartphone3 = factory.getSmartphone(args[0]);
		smartphone3.browse();
		smartphone3.os();
	}

}
