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
	}

}
