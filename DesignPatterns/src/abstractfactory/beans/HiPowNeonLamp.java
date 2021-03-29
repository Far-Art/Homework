package abstractfactory.beans;

public class HiPowNeonLamp extends NeonLamp {

	public Lamp getLamp() {
		return new HiPowNeonLamp();
	}

	public HiPowNeonLamp() {
		super();
		this.type = "Hi power neon";
		this.name = "Very bright neon lamp";
		this.power = 65.7;
	}

}
