package abstractfactory.beans;

public abstract class Lamp {
	protected String type;
	protected String name;
	protected double power;
	protected String radiatorType;

	public void printLamp() {
		System.out.println(
				"Lamp type: " + type + ", Name: " + name + ", Power: " + power + ", Radiator: " + radiatorType);
	}

	public Lamp getData() {
		return this;
	}
}
