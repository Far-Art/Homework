package decorator.classes;

public class VideoCard extends Hardware {

	public VideoCard() {
		super();
	}

	public VideoCard(Component component) {
		super(component);
	}

	@Override
	public String getComponents() {
		return "Video card" + (component != null ? " + " + component.getComponents() : "");
	}

}
