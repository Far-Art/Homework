package factory;

public class SmartphoneFactory {
	public Smartphone getSmartphone(String smartphone) {
		if (smartphone.equalsIgnoreCase("samsung") || smartphone.equalsIgnoreCase("android")) {
			return new Samsung();
		}
		return new Iphone();
	}
}
