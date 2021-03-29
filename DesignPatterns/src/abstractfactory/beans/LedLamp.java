package abstractfactory.beans;

public class LedLamp extends Lamp {

	public LedLamp() {
		this.type = "Led";
		this.name = "Pretty Led Lamp";
		this.power = 14.5;
		this.radiatorType = "Passive radiator";
	}

}
