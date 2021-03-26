package singleton1;

public enum MyEnum {
	INSTANCE1, INSTANCE2;
	
	public String message = "No message";
	
	public void printMessage() {
		System.out.println("MyEnum message: " + message);
	}
}
