package factory;

public class Samsung extends Smartphone {

	@Override
	public void browse() {
		System.out.println("browsing on Samsung");
		
	}

	@Override
	public void os() {
		System.out.println("OS: Android");
	}

}
