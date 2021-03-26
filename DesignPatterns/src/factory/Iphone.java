package factory;

public class Iphone extends Smartphone{

	@Override
	public void browse() {
		System.out.println("browsing on iphone");
		
	}

	@Override
	public void os() {
		System.out.println("OS: iOS");
	}

}
