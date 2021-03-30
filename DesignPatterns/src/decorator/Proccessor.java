package decorator;

public class Proccessor extends Hardware {

	public Proccessor() {
		super();
	}

	public Proccessor(Component component) {
		super(component);
	}

	@Override
	public String getComponents() {
		return "proccessor" + (component != null ? " + " + component.getComponents() : "");
	}

}
