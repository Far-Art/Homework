package decorator;

public class Motherboard extends Hardware {

	public Motherboard() {
		super();
	}

	public Motherboard(Component component) {
		super(component);
	}

	@Override
	public String getComponents() {
		return "Motherboard" + (component != null ? " + " + component.getComponents() : "");
	}

}
