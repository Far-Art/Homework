package abstractfactory.beans;

public class HiPowHalogenLamp extends HalogenLamp {

	public Lamp getLamp() {
		return new HiPowHalogenLamp();
	}

	public HiPowHalogenLamp() {
		super();
		this.type = "Hi power halogen";
		this.name = "Very bright halogen lamp";
		this.power = 100.0;
	}

}
