package factory;

public class SmartphoneFactory {
	public Smartphone getSmartphone(String smartphone) {
		if (smartphone.equalsIgnoreCase("samsung")) {
			return new Samsung();
		}
		return new Iphone();
	}
}
