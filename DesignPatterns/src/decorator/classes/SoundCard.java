package decorator.classes;

public class SoundCard extends Hardware implements Component {

	public SoundCard() {
		super();
	}

	public SoundCard(Component component) {
		super(component);
	}

	@Override
	public String getComponents() {
		return "Sound card" + (component != null ? " + " + component.getComponents() : "");
	}

}
