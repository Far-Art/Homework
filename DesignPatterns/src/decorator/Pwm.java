package decorator;

public class Pwm extends Hardware {

	public Pwm() {
		super();
	}

	public Pwm(Component component) {
		super(component);
	}

	@Override
	public String getComponents() {
		return "pwm" + (component != null ? " + " + component.getComponents() : "");
	}

}
