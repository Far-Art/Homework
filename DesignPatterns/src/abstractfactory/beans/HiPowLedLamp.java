package abstractfactory.beans;

public class HiPowLedLamp extends LedLamp {

	public Lamp getLamp() {
		return new HiPowLedLamp();
	}

	public HiPowLedLamp() {
		this.type = "Hi power led";
		this.name = "Very bright led lamp";
		this.power = 100.0;
		this.radiatorType = "Active radiator";
	}

}
