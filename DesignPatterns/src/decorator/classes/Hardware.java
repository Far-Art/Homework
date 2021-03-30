package decorator.classes;

public abstract class Hardware implements Component {

	protected Component component;

	public Hardware() {
	}

	public Hardware(Component component) {
		this.component = component;
	}

}
